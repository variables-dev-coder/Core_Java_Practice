package day59_Packages_And_import;

public class Notes {
    public static void main(String[] args) {


        /*

1. What is a Package in Java?
-----------------------------
A package is a namespace (a container) that organizes related classes, interfaces, and sub-packages.

    Think of it like a folder in your computer that stores files.
    It helps avoid naming conflicts, improves modularity, and makes code reusable & maintainable.


2. Types of Packages
--------------------
1. Built-in Packages (Predefined)
    Already provided by Java.
Examples:
    java.lang → Core classes (String, Math, Object, etc.)
    java.util → Data structures (List, Set, Map, Date, Scanner, etc.)
    java.io → Input/Output (File, BufferedReader, etc.)
    java.sql → Database connectivity
    java.time → Date/Time API



2. User-defined Packages
    Packages you create for your project to organize classes.


3. Creating a Package (User-defined)
-------------------------------------
    Let’s create a package com.munna.math:

// File: Addition.java
// Save in folder: com/munna/math/
package com.munna.math;

public class Addition {
    public int add(int a, int b) {
        return a + b;
    }
}


4. Using a Package (import statement)
-------------------------------------
// File: TestAddition.java
import com.munna.math.Addition; // Import specific class

public class TestAddition {
    public static void main(String[] args) {
        Addition obj = new Addition();
        System.out.println("Sum: " + obj.add(10, 20));
    }
}

Sum: 30


5. Different Ways to Use import
-------------------------------
1. Import Specific Class
    import java.util.Scanner;
    Only Scanner is accessible.


2. Import Entire Package
    import java.util.*;

All classes inside java.util are accessible (ArrayList, HashMap, etc.)
But: doesn’t include sub-packages.


3. Import Static Members

import static java.lang.Math.*;

public class Test {
    public static void main(String[] args) {
        System.out.println(sqrt(25)); // No need Math.sqrt()
        System.out.println(max(10, 20));
    }
}


4. Fully Qualified Name (FQN) – No Import

public class Test {
    public static void main(String[] args) {
        java.util.Date date = new java.util.Date();
        System.out.println(date);
    }
}

Used when two classes with same name exist (e.g., java.util.Date and java.sql.Date).


6. Rules of Packages & Imports
------------------------------

✔ A class can belong to only one package.
✔ Package statement must be the first line in the source file.
✔ You can have multiple imports, but only one package declaration.
✔ If no package declared → class goes into default package.
✔ Importing with * does not import sub-packages. Example:

import java.util.*; // Imports List, Map, etc.
import java.util.concurrent.*; // Needed separately for concurrent classes


7. Real-Time Usage (in Projects)
--------------------------------
Example: Spring Boot Project
Structure:

com.munna.springboot
   ├── controller
   ├── service
   ├── repository
   ├── model

controller package → REST APIs
service package → Business logic
repository package → Database access
model package → Entities

This layered package structure makes microservices scalable and maintainable.


8. Common Interview Questions
-----------------------------

Q1: Why use packages in Java?
To avoid class name conflicts, provide access control, and make large applications modular.

Q2: Difference between import specific class vs *?
Specific class → Loads only that class.
* → Compiler makes all classes accessible but loads only used ones at runtime.

Q3: Can two packages have the same class name?
Yes (e.g., java.util.Date and java.sql.Date). Use fully qualified name.

Q4: What is static import?
Allows direct use of static members without class name (e.g., sqrt(25) instead of Math.sqrt(25)).

Q5: What is default package?
If no package is declared, the class belongs to the unnamed (default) package. Not recommended for real projects.


9. Mastery-Level Trick: Custom Package + JAR
--------------------------------------------
1.Compile with package:
    javac -d . Addition.java

Creates directory structure com/munna/math/Addition.class.


2.Create JAR:
jar cf mathutils.jar com/munna/math/*.class


3.Use in another project:

javac -cp mathutils.jar TestAddition.java
java -cp .;mathutils.jar TestAddition


10. Summary
------------
    Package = folder (namespace).
    import = allows external classes.
    Different import methods: specific, *, static, FQN.
    Packages = modularity + reusability + maintainability.
    Real-world → organize project into controller, service, repository, model.
    Advanced → build JARs for reusable libraries.


         */



    }
}
