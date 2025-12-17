package day81_Classloading_Basics;

public class Notes {
    public static void main(String[] args) {

        /*

1. What is Class Loading?
------------------------
Class Loading is the JVM process of:
    Finding → Loading → Verifying → Preparing → Resolving → Initializing a .class file into memory
    when it is first referenced.

Important:
    Java does not load all classes at startup
    Classes are loaded on-demand (lazy loading)

-----------------------------------------------------------------------------------------------------------------


2. When Does JVM Load a Class?
------------------------------
    A class is loaded when:
        new keyword is used
        A static method or static variable is accessed
        Class.forName("ClassName") is called
        A class is a subclass of another loaded class

    Not loaded when:
        Reference variable is declared only


-------------------------------------------------------------------------------------------------------------------



3. JVM Class Loading Phases (VERY IMPORTANT)
--------------------------------------------
Phase 1: Loading
    JVM:
    Reads .class bytecode
    Creates Class object in Metaspace
    Loads static fields (default values only)

    Loader decides where to load from (JAR, folder, network, etc.)

Phase 2: Linking
    Linking has 3 sub-steps:

a) Verification
    Bytecode validity
    Stack safety
    Type safety
    Prevents malicious code

This is why Java is secure

b) Preparation
    Static variables get default values

static int x;   // x = 0
static String s; // s = null

No assignments yet!

c) Resolution
    Symbolic references → Direct memory references
    Optional (can be delayed)

Phase 3: Initialization
    Static variables get actual values
    Static blocks execute top to bottom


-------------------------------------------------------------------------------------------------------------------


4. ClassLoader Hierarchy (CORE CONCEPT)
----------------------------------------
    Java uses Parent Delegation Model

Bootstrap ClassLoader
        ↑
Extension (Platform) ClassLoader
        ↑
Application ClassLoader


Bootstrap ClassLoader
---------------------
    Loads core Java classes
    java.lang.*, java.util.*
    Written in native code (C/C++)
    No direct reference in Java

Extension / Platform ClassLoader
-------------------------------
    Loads extension libraries
    From JAVA_HOME/lib/ext (older)
    Now: platform modules

Application ClassLoader
-----------------------
    Loads your project classes
    From classpath / module path


------------------------------------------------------------------------------------------------------------------


5. Parent Delegation Model (VERY CRITICAL)
------------------------------------------
Rule:
    Child class loader always asks parent first

Why?
    Prevents overriding core classes (java.lang.String)

Security + consistency

Flow:
    AppClassLoader → ExtClassLoader → Bootstrap

Only if parent cannot load, child tries.

-------------------------------------------------------------------------------------------------------------------


6. Static Block Execution Order (Tricky Interview Area)
------------------------------------------------------

class A {
    static {
        System.out.println("A static");
    }
}

class B extends A {
    static {
        System.out.println("B static");
    }
}

public class Test {
    public static void main(String[] args) {
        new B();
    }
}

Output:

A static
B static

Parent class loaded first
Static blocks execute only once


------------------------------------------------------------------------------------------------------------------


7. Class.forName() vs ClassLoader.loadClass()
---------------------------------------------
Class.forName("A")
    Loads
    Links
    Initializes (static blocks run)

ClassLoader.loadClass("A")
    Loads only
    No initialization

Used heavily in:
    JDBC
    Frameworks
    Reflection-based tools

-------------------------------------------------------------------------------------------------------------------


8. Metaspace vs PermGen (JVM Internals)
---------------------------------------

| Feature      | PermGen        | Metaspace      |
| ------------ | -------------- | -------------- |
| Java Version | ≤ Java 7       | Java 8+        |
| Memory Type  | JVM Heap       | Native Memory  |
| OOM Issue    | Yes            | Less likely    |
| Stores       | Class metadata | Class metadata |


--------------------------------------------------------------------------------------------------------------------


9. Real-Time Use Cases
----------------------
    Spring Boot
    Hibernate
    JDBC
    Microservices
    Plugin systems
    Hot reload tools

Frameworks dynamically:
    Load classes
    Scan annotations
    Create proxies

10. Common Interview Questions (Day 81 Must-Know)
------------------------------------------------
    1. Why is class loading lazy?
    2. Explain parent delegation model
    3. Difference between Class.forName() and loadClass()
    4. Can we override java.lang.String? (NO – WHY?)
    5. What happens if static block throws exception?
    6. Where are classes stored in JVM memory?
    7. Who loads Object class?

-------------------------------------------------------------------------------------------------------------------

11. Expert Tip (Top 10% Knowledge)
----------------------------------
    Class loading ≠ Object creation
    Class loads once, objects can be many
    Static memory is per class, not per object
    Understanding class loaders is mandatory for JVM internals & frameworks



         */
    }
}
