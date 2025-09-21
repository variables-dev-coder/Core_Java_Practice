package day61_Garbage_Collection;

public class Notes {
    public static void main(String[] args) {


        /*


Garbage Collection in Java (Mastery Level)
------------------------------------------
1. What is Garbage Collection?
    Definition: Automatic process by which JVM reclaims memory from objects that are no longer referenced (unreachable).

Why needed?
    Prevents memory leaks.
    Frees developers from manual memory management (like in C/C++).
    Keeps applications stable for long-running processes.

JVM takes care of allocating memory on the heap and releasing unused memory.


2. How JVM Decides Garbage
    An object becomes eligible for GC if no live thread can access it.

Situations:
    1.Reference set to null.
    2.Reference assigned to another object.
    3.Object goes out of scope (method ends).
    4.Cyclic references (objects referencing each other but not reachable from any root).
Determined via Reachability Analysis using GC Roots.



3. GC Roots in Java
GC roots are special references that mark starting points for reachability:
    Local variables in stack frames.
    Active thread objects.
    Static fields.
    JNI (native) references.
If an object is reachable from GC roots → Alive.
If not reachable → Garbage.


4. Garbage Collectors in JVM
    Serial GC → Single-threaded, suitable for small apps.
    Parallel GC (Throughput GC) → Multiple threads, high throughput, suitable for server apps.
    CMS (Concurrent Mark-Sweep) → Low pause time, deprecated after Java 14.
    G1 GC (Garbage-First) → Default from Java 9+, region-based, balanced throughput & low latency.
    ZGC & Shenandoah (JDK 11+) → Ultra-low pause, scalable to large heaps.


Generational Model (Core)
Java heap is divided into generations because:
    Most objects die young (short-lived).
    Separating memory by object lifetime optimizes GC.

Heap Layout
1.Young Generation
    Eden space: New objects allocated here.
    Survivor spaces (S0, S1): Objects that survive minor GC move here.
    GC event here is called Minor GC (frequent, fast).

2.Old Generation (Tenured)
    Objects surviving multiple minor GCs are promoted here.
    GC event here is called Major GC or Full GC (slower, expensive).

3.Permanent Generation (PermGen) [till Java 7]
    Stores class metadata, method info, static variables.
    Replaced by Metaspace (Java 8+).

Minor GC = cleans Young Gen (fast).
Major/Full GC = cleans Old Gen (slow, pauses app).


Object Lifecycle in Generational GC
    1.New object → Eden.
    2.Minor GC → survivors go to S0/S1.
    3.After surviving multiple GCs → promoted to Old Gen.
    4.Old Gen full → Major GC triggers.
    5.Class metadata stored in Metaspace (not heap).



5. Important JVM GC Concepts
    Stop-the-World (STW) → JVM pauses application threads during GC.
    Compacting → After GC, objects moved together to avoid fragmentation.
    Promotion → Survivor → Old Gen after threshold.
    GC Tuning Parameters:
        -Xms = initial heap size
        -Xmx = max heap size
        -Xmn = size of young generation
        -XX:+UseG1GC = use G1 collector
        -XX:MaxMetaspaceSize = set metaspace size


Interview Q&A (Mastery)
-----------------------
Q1. How does JVM know an object is unreachable?
    JVM uses reachability analysis from GC Roots. If object graph can’t reach it → eligible for GC.

Q2. Difference between Minor GC and Major GC?
    Minor GC: Young Gen only, fast, frequent.
    Major/Full GC: Old Gen + Young Gen + Metaspace, slow, application pause.

Q3. Why Generational GC is efficient?
    Because most objects are short-lived. Collecting them separately avoids scanning the entire heap frequently.

Q4. What happens if GC can’t reclaim memory?
    JVM throws OutOfMemoryError.

Q5. What is “Stop-the-World”?
    A JVM pause where all application threads stop until GC finishes.


Example Code for GC

public class GarbageCollectionDemo {

    public static void main(String[] args) {
        // Object eligible for GC after null assignment
        String str = new String("Hello");
        str = null;

        // Object eligible for GC after reassignment
        Object obj1 = new Object();
        Object obj2 = new Object();
        obj1 = obj2;

        // Anonymous object (no reference) → immediate GC eligible
        new GarbageCollectionDemo();

        // Suggest JVM to run GC
        System.gc();
        Runtime.getRuntime().gc();
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Finalize method called before GC!");
    }
}



Summary for Mastery
-------------------
    GC frees memory automatically, prevents leaks.
    Generational model = Young Gen (Eden + Survivor) + Old Gen + Metaspace.
    Minor GC (fast) vs Major GC (slow).
    Reachability via GC Roots.
    Different collectors available (Serial, Parallel, CMS, G1, ZGC).
    JVM tuning parameters can control GC behavior.
    GC is not predictable → developer must avoid memory leaks (e.g., static collections, unclosed resources).

=================================================================================

10 Interview Questions & Answers (concise, high-value)
------------------------------------------------------

1. What is the difference between reachability and liveness?
        Reachability (from GC roots) determines eligibility for GC. Liveness is a broader program
        concept (still-used objects). Reachable objects are live; unreachable objects are eligible for collection.

2. How does the JVM decide when to run a GC?
        JVM runs GC when memory pressure reaches thresholds (e.g., Eden fills causing minor GC;
        old gen fills causing mixed/full GC). Collectors also make heuristics based on pause
        targets and allocation patterns.

3. What are strong, soft, weak, and phantom references and how do they affect GC?
    Strong: normal references; prevent GC.
    Soft: collected only under memory pressure (useful for caches).
    Weak: collected at next GC if only weakly reachable (useful for canonical maps).
    Phantom: used with ReferenceQueue for post-mortem cleanup; get() returns null.

4. Explain the generational hypothesis and how JVM uses it.
        Most objects die young → JVM divides heap into Young and Old generations.
        Frequent fast minor GC cleans Young; survivors promoted to Old, where collections are less frequent.

5. What is a “Stop-the-World” pause and which collectors try to minimize it?
        STW pauses suspend all application threads during parts of GC. Collectors
        minimizing pauses: G1 (low-pause mode), ZGC, Shenandoah (concurrent evacuation),
        and (historically) CMS.

6. Difference between Minor GC, Major GC, and Full GC.
        Minor GC: cleans Young Gen (fast).
        Major GC: cleans Old Gen (may not include Young depending on VM).
        Full GC: complete collection of all generations + possibly metaspace; expensive.

7. What is object promotion and how does the JVM decide promotion?
        Promotion = moving surviving objects from Survivor spaces to Old Gen.
        Decision by survivor age threshold (default age or adaptive heuristics).

8. How does GC interact with finalization and why is finalize() discouraged?
        finalize() runs before object reclamation but is unpredictable and can
        resurrect objects; it adds delay to reclamation and performance overhead.
        Use Cleaner/try-with-resources instead.

9. How to diagnose GC problems in production?
        Use GC logs (-Xlog:gc* or legacy -XX:+PrintGCDetails), heap dumps
        (jmap -dump), profilers (YourKit, JFR), and observe pause times/throughput.
        Analyze allocation patterns, large object allocation, and long-living collections.

10. How do you tune GC for a latency-sensitive service?
        Choose low-pause collectors (ZGC, Shenandoah, G1 in low-pause mode),
        reduce max pause targets, size the heap/young gen appropriately, minimize
        allocation churn, and avoid blocking allocations (object pooling only if necessary).



5 Tricky Questions & Answers (they test deep understanding)
-----------------------------------------------------------

1. Q: If two objects reference each other but are unreachable from roots, will they be collected?

      Yes. Reachability analysis reaches from GC roots — cyclic references not reachable from roots
      are garbage and will be collected. GC tracks object graph, not reference counts (modern JVMs use tracing).



2. Q: Can System.gc() guarantee immediate garbage collection?

      No — it’s a suggestion. JVM may ignore it. Rely on proper design and tuning rather than forcing GC.



3. Q: When is a WeakReference cleared relative to the collector’s phases?

    When the referent becomes weakly reachable (no strong/soft refs reachable), it will
    be cleared during the GC cycle, typically before reference queues are processed — implementation
    details vary but the reference is queued for collection handling.


4. Q: Can an object be resurrected during finalization? What happens next?

    Yes, finalizer can assign this to a reachable static variable — object
    becomes reachable again and is not collected. However, finalize() runs at
    most once; if resurrected and later becomes unreachable again, it’s not finalized
    again and will be collected without another finalize call.




5. Q: Why might increasing heap size sometimes worsen latency?

    Larger heaps increase time to scan/compact during full collections and can extend
    pause durations (more memory to traverse). Also, longer-tenured objects may increase
    fragmentation/compaction costs. Collector choice and tuning matter.



         */


    }
}
