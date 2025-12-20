package day83_Performance_Tuning_Basics;

public class Notes {
    public static void main(String[] args) {

        /*

Day 83 – Java Performance Tuning Basics
---------------------------------------
Target: JVM Memory Flags & GC Tuning (Intro → Practical Understanding)

BIG PICTURE (Before Anything Else)
----------------------------------
Java performance tuning = controlling how JVM uses memory & CPU

Two major pillars:
    JVM Memory Management
    Garbage Collection (GC)

Now we start with foundation, not tools yet.
--------------------------------------------

CONCEPT 1: JVM Memory Architecture (MUST KNOW)
----------------------------------------------
Before tuning → you must know what you are tuning

JVM Memory Areas (Simplified)

JVM Memory
│
├── Heap Memory
│   ├── Young Generation
│   │   ├── Eden
│   │   ├── Survivor S0
│   │   └── Survivor S1
│   └── Old Generation
│
├── Metaspace
├── Stack (per thread)
└── Code Cache


Why this matters?
-----------------
    -Xms and -Xmx → Heap
    GC mainly works on Heap
    Bad tuning = slow app, crashes, high CPU

Real-World Example
------------------
Spring Boot App:
    Controllers → short-lived objects (Young Gen)
    Repositories → long-lived objects (Old Gen)
    Class loading → Metaspace


CONCEPT 2: What are JVM Flags?
------------------------------
Definition
JVM flags = command-line parameters that control JVM behavior.

Example:
java -Xms512m -Xmx1024m -jar app.jar

Flags control:
    Memory size
    GC type
    GC behavior
    Performance logging

Categories of JVM Flags

| Category     | Example                |
| ------------ | ---------------------- |
| Heap Size    | `-Xms`, `-Xmx`         |
| GC Selection | `-XX:+UseG1GC`         |
| GC Behavior  | `-XX:MaxGCPauseMillis` |
| Logging      | `-Xlog:gc`             |


CONCEPT 3: -Xms (Initial Heap Size)
-----------------------------------
What it means

-Xms = Initial Heap Memory

Example

-Xms512m

JVM starts with 512 MB heap

Why it matters
    JVM grows heap dynamically
    Growing heap costs CPU + time
    Frequent resizing = performance hit

Bad Configuration
    -Xms128m -Xmx2048m

JVM keeps expanding heap → slow startup + GC pressure

Good Configuration (Production)

-Xms1024m -Xmx1024m

Fixed heap
Predictable performance
Fewer GC pauses


CONCEPT 4: -Xmx (Maximum Heap Size)
-----------------------------------
What it means
    -Xmx = Maximum Heap Memory

Example:
    -Xmx2g

JVM will never exceed 2 GB heap

Why it matters
    Prevents JVM from eating all system RAM
    Avoids OS swapping (deadly for performance)

Real-World Failure
    No -Xmx set
    JVM uses all RAM
    Server freezes
    App killed

Best Practice

| Server RAM | Recommended -Xmx |
| ---------- | ---------------- |
| 4 GB       | 2 GB             |
| 8 GB       | 4–6 GB           |
| 16 GB      | 8–12 GB          |


Leave space for:
    OS
    Docker
    DB
    Other services


CONCEPT 5: -Xms vs -Xmx (Very Important)
----------------------------------------

| Flag     | Purpose                       |
| -------- | ----------------------------- |
| `-Xms`   | Starting heap                 |
| `-Xmx`   | Max heap                      |
| Mismatch | Causes resizing & GC overhead |
| Match    | Stable performance            |


CONCEPT 6: What is Garbage Collection (GC)?
------------------------------------------
Definition
GC = automatic memory cleanup of unused objects.

Java does:

new Object(); // allocate
// JVM decides when to free memory


Why GC tuning is needed
-----------------------
    GC pauses stop application threads (STW – Stop The World)
    Poor GC → high latency
    Microservices = GC sensitive

Types of Objects
----------------
    Short-lived → Young Gen
    Long-lived → Old Gen

GC optimizes based on this assumption.


CONCEPT 7: GC Types (Intro Level)
----------------------------------
| GC          | Use Case               |
| ----------- | ---------------------- |
| Serial GC   | Small apps             |
| Parallel GC | High throughput        |
| G1 GC       | Balanced (default now) |
| ZGC         | Low latency (advanced) |
| Shenandoah  | Ultra-low pause        |



         */
    }
}
