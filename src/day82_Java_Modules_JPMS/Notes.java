package day82_Java_Modules_JPMS;

public class Notes {
    public static void main(String[] args) {

        /*

1. Why Java Modules Were Introduced (The Real Problem)
------------------------------------------------------
Before Java 9:
    Java apps = classpath chaos
    No strong encapsulation
    Version conflicts (jar hell)
    Everything was public at runtime, even internal JDK APIs
    Huge monolithic JDK (slow startup, larger memory)

JPMS Goals
----------
    Strong encapsulation
    Reliable configuration
    Explicit dependencies
    Smaller, faster runtime images
    Clear boundaries between components

Think of modules as “packages + rules + contracts”


2. What Is a Module?
-------------------
A module is:
    A named group of packages
    With explicit dependencies
    With controlled visibility


Old world:

JAR → Packages → Classes

New world:

Module → Packages → Classes


3. module-info.java (Heart of JPMS)
-----------------------------------

Every module has:

module com.munna.order {
    requires com.munna.payment;
    exports com.munna.order.api;
}

This file:
    Lives at root of module
    Compiled by the compiler
    Enforced at compile-time + runtime



4. requires – Dependency Declaration
------------------------------------
Basic

requires com.munna.payment;

requires transitive
Used for API modules

module order.api {
    requires transitive payment.api;
}


Meaning:
    If A requires B transitively
    Anyone who requires A automatically gets B

Used heavily in framework design


5. exports – Controlled Access
------------------------------

exports com.munna.order.api;

Only exported packages are:
    Accessible to other modules
    Visible at compile & runtime


Selective Export
    exports com.munna.internal to com.munna.testing;

Strong encapsulation:
    Same as public but at module level



6. Strong Encapsulation vs public
---------------------------------
| Level     | Meaning                       |
| --------- | ----------------------------- |
| `public`  | Accessible within same module |
| `exports` | Accessible outside module     |
| No export | Fully hidden                  |

Even reflection is blocked unless opened


7. opens – Reflection Control (Very Important)
----------------------------------------------
Frameworks like:
    Spring
    Hibernate
    Jackson
Need reflection.

Open a package:
opens com.munna.order.entity;

Open only to specific module:
opens com.munna.order.entity to spring.core;


opens ≠ exports
    opens → reflection
    exports → compile-time access



8. open module (Framework-Friendly)
-----------------------------------

open module com.munna.order {
    requires spring.context;
}


Meaning:
    All packages open for reflection
    But not exported


Spring Boot often uses this

9. Module Resolution (How JVM Decides)
--------------------------------------
At startup:
1. Reads all module-info.class
2. Builds module graph
3. Checks:
       Missing modules
       Cycles
       Split packages
4. Application starts only if graph is valid

Fail-fast design

10. Named vs Automatic vs Unnamed Modules
-----------------------------------------
Named Module
    Has module-info.java
    Strong encapsulation

Automatic Module
    Regular JAR on module path
    Gets auto name
    Weak encapsulation

Unnamed Module (Classpath)
    Legacy mode
    No encapsulation
    Everything accessible

Best practice: Gradually migrate → Automatic → Named


11. Split Package Problem
-------------------------
Not allowed:

com.munna.util in two modules

JPMS forbids it to:
    Avoid ambiguity
    Ensure reliability



12. uses & provides (Service Loader)
------------------------------------
Service Interface Module

module payment.api {
    exports com.munna.payment;
    uses PaymentService;
}

Implementation Module

module payment.impl {
    requires payment.api;
    provides PaymentService with UpiPayment;
}

Enables plug-in architecture
Used in:
    JDBC
    Logging
    SPI frameworks



13. JDK Modules (java.base, java.sql, etc.)
--------------------------------------------
java.base → automatically available
Others must be required

requires java.sql;

Smaller runtime, better security


14 jdeps – Analyze Dependencies
-------------------------------
jdeps myapp.jar

Shows:
    Module dependencies
    Internal API usage

Critical for migration


15. jlink – Custom Runtime Image
--------------------------------
jlink --module-path mods \
      --add-modules com.munna.app \
      --output my-runtime

Result:
    Tiny JVM
    Faster startup
    Used in production & cloud


16. JPMS + Spring Boot (Reality)
--------------------------------
Spring Boot 2+ supports JPMS partially
Most apps:
    Use automatic modules
    Or open module
Full strict JPMS in Spring is advanced-level


Interview tip: Explain trade-offs honestly


17. Common Interview Traps
--------------------------
1.Classpath vs Modulepath?
    Classpath = no rules
    Modulepath = strict graph

2. Why reflection fails?
    Package not opened

3. Why NoClassDefFoundError in modules?
    Missing requires

4. Why JPMS is not fully adopted?
     Legacy libs + reflection-heavy frameworks


17. When Should YOU Use JPMS?
-----------------------------
 Libraries
 SDKs
 Large enterprise apps
 Security-critical systems
 Small CRUD apps (classpath OK)

19. Day 82 Mastery Checklist
----------------------------
You now understand:
    Why JPMS exists
    module-info.java
    requires, exports, opens
    Strong encapsulation
    Service loader
    jdeps & jlink
    Real-world Spring usage

This is Senior Java Engineer knowledge

         */
    }
}
