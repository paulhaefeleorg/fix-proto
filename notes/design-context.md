# FIX Prototype Project — Design Context

## Goal
Prototype and compare two FIX message processing architectures:
1. **Thread-Pool System (TPS)** — circa 2014 style using QuickFIX-J, thread pools, and locking.  
   - Latency achieved: ~10–20 ms message→ack at scale.  
   - Based on standard Java heap, synchronized access, thread contention.

2. **Off-Heap System (OHS)** — modern low-latency style.  
   - Target: sub-millisecond (or faster) latency.  
   - Key techniques:  
     - Off-heap memory (Chronicle Bytes/Wire/Queue style).  
     - Lock-free scheduling (Disruptor pattern).  
     - Cache-aware, static lookup structures.  
     - Potential thread pinning and CPU-affinity.  
     - Garbage-free design.

---

## Environment Setup
- **Host:** Windows 11 Home.  
- **WSL2 (Ubuntu) + Docker Desktop:** preferred dev runtime to simplify Linux tooling and Docker integration.  
- **IDE options:**  
  - **Cursor** (VS Code fork with AI integration, GPT-5 supported).  
  - **VS Code + Continue (and optionally Cline)**.  
  - **IntelliJ IDEA** with AI Assistant (secondary option, less AI-first).  

- **Chosen path:** Cursor with GPT-5 pinned, devcontainer workflow for reproducibility.

---

## Java Toolchain
- Initially installed: Temurin OpenJDK 17.0.4.  
- Upgraded to: **Temurin JDK 21.0.8.9 (HotSpot)** at  
  `C:\\Program Files\\Eclipse Adoptium\\jdk-21.0.8.9-hotspot`.  
- Verified `JAVA_HOME` and PATH updated.  
- Cursor configured to detect both JDK 21 (default) and JDK 17.

---

## Dev Container Setup
Baseline `devcontainer.json` uses:
- Image: `mcr.microsoft.com/devcontainers/java:1-21-bullseye`.  
- Features: common-utils, docker-in-docker.  
- Run args: `--cap-add=SYS_PTRACE`, `--security-opt=seccomp=unconfined`, `--cpus=4`, `--memory=8g`.  
- Post-create installs: `linux-perf`, `sysstat`, `numactl`, `hwloc`, `iperf3`.  
- Extensions: Java pack, Remote-Containers.

---

## Project Organization
```
fix-proto/
  ├── .vscode/settings.json       # pin GPT-5 model
  ├── .devcontainer/devcontainer.json
  ├── notes/design-context.md     # this file
  ├── src/main/java/...           # prototype code
  └── build.gradle or pom.xml     # build file
```

---

## AI Model Usage
- Cursor supports **GPT-5** selection.  
- “Auto” model mode trades off cost/speed vs determinism.  
- For this project → GPT-5 is explicitly pinned (reproducibility is important for comparing TPS vs OHS).  
- Configured in `.vscode/settings.json`:
  ```json
  {
    "cursor.chat.model": "gpt-5"
  }
  ```

---

## Next Steps

### TPS (Thread-Pool System)
- **FIX Engine:** Use **QuickFIX-J** (classic choice from ~2014 system).  
- **Parsing:** QuickFIX-J message parsing and validation pipeline (minimal customizations first, then tune dictionary and field access paths).  
- **Concurrency model:** Thread pools with `LinkedBlockingQueue`/`ArrayBlockingQueue` between stages (accept → parse → biz logic → ack).  
- **Synchronization:** Explicit locks/synchronized sections around shared structures; baseline correctness first.  
- **I/O:** NIO socket (default QuickFIX-J acceptor/initiator) with OS TCP buffers at defaults; later experiment with buffer sizes.  
- **Metrics:** End-to-end latency (message→ack) under load; lock contention (JFR), GC pauses (GC logs/JFR), CPU utilization per stage.

### OHS (Off-Heap System)
- **Messaging backbone:** **Chronicle Queue** for inter-stage communication; **Chronicle Bytes/Wire** for off-heap serialization and flyweight accessors.  
- **FIX parsing:** Start with a lean field scanner over `Bytes` (avoid POJOs per message). Optionally compare **Chronicle FIX** or a minimal custom decoder for a subset (e.g., NewOrderSingle).  
- **Scheduling:** **LMAX Disruptor** ring buffers for lock-free stage handoff (parse → biz logic → ack).  
- **Memory model:** Flyweight pattern over direct/off-heap buffers; no per-message allocation. Pre-size ring buffers and pools; cache-align hot structs to avoid false sharing.  
- **Threading:** Pin dedicated threads (e.g., `taskset`/`numactl` or Java affinity libs) for parse/biz/ack; isolate from GC threads.  
- **I/O:** Chronicle TCP or Java NIO with direct buffers; verify zero-copy paths where possible.  
- **Backpressure:** Disruptor’s producer strategies vs Chronicle Queue appender limits; measure behavior under overload.  
- **Metrics:** Chronicle Latency / HdrHistogram for p50/p95/p99/p999; JFR events; `perf` for CPU cycles, LLC misses, context switches; `numactl --hardware` to record topology.

### Cross-cutting
- **Load generation:**  
  - TPS path: QuickFIX-J *initiator* sending bursts with configurable think times and message sizes.  
  - OHS path: Chronicle Queue writer + TCP emitter to simulate inbound flow with deterministic pacing.  
  - Provide repeatable seeds and scripts to reproduce runs.

- **Benchmark harness:**  
  - **JMH** micro-benchmarks for parser hot paths.  
  - **Macro driver** (standalone app) to orchestrate full pipeline runs; report histogram snapshots and CSVs per run.  
  - Sweep scenarios: message size (small/medium/large), rate (msgs/s), burstiness, parallel sessions.

- **Observability:**  
  - **Java Flight Recorder (JFR)** profiles per scenario; store `.jfr` artifacts.  
  - **GC logs** (ZGC/G1) for TPS vs minimal-GC OHS; track allocation rates and pause times.  
  - OS-level: `perf stat`, `perf record`, `sar`, `pidstat` for CPU, migrations, context switches; `hwloc-ls` for topology snapshots.

- **Reproducibility:**  
  - Docker Compose with three services: `loadgen`, `tps`, `ohs`.  
  - Version-locked images; `Makefile` targets: `make build`, `make run-tps`, `make run-ohs`, `make bench`.  
  - Store run configs in `benchmarks/` with YAML/JSON; commit histogram outputs for comparison.

### Deliverables
- Side-by-side **TPS vs OHS** implementations, with Docker Compose orchestrating both plus load generator.  
- Metrics dashboards (CSV → plots or a tiny web UI) showing latency distributions, GC impact, and CPU utilization.  
- A concise write-up explaining why off-heap + lock-free designs reduce GC pressure and tail latency vs thread-pool + heap-bound designs — ready for interview storytelling.

