package day79_Annotation;

public class Notes {

    public static void main(String[] args) {

        /*

DAY 1 — ANNOTATIONS (Built-in + Custom)
=======================================
Annotations give metadata to your code.
Frameworks like Spring, Hibernate, Jackson rely heavily on annotations.

1. Built-in Annotations
-----------------------
@Override
---------

Used to ensure that a method is overriding a parent method.

class A {
    void show() {}
}

class B extends A {
    @Override
    void show() {
        System.out.println("Overridden");
    }
}

->Prevents mistakes
->Good for compiler checking


@Deprecated
-----------

Marks a method/class as old or unsafe → Should not be used anymore.

@Deprecated
void oldMethod() {
    System.out.println("Old");
}


@SuppressWarnings
-----------------

Tells the compiler to ignore warnings.

@SuppressWarnings("unchecked")
void test() {
    List list = new ArrayList();
}


2. Meta-Annotations
-------------------

Meta-annotations are annotations applied on other annotations.

@Target
--------

Where the annotation can be used:

@Target(ElementType.METHOD)

Values:
    TYPE (class)
    METHOD
    FIELD
    PARAMETER
    CONSTRUCTOR
    ANNOTATION_TYPE
    etc.

@Retention
-----------

How long the annotation is available:

@Retention(RetentionPolicy.RUNTIME)

Types:
    SOURCE → removed at compile time
    CLASS → available in bytecode (default)
    RUNTIME → available at runtime (used by Spring, Hibernate)

For reflection → ALWAYS use RUNTIME



3. Create Custom Annotation (Real Example)
------------------------------------------
Goal: Create @LogExecutionTime annotation
Step 1 — Create Annotation

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface LogExecutionTime {
}

Available at runtime
Used on methods



4. Annotation Processing Using Reflection
------------------------------------------

We will read annotation at runtime.


import java.lang.reflect.Method;

class TestService {

    @LogExecutionTime
    public void serve() throws InterruptedException {
        Thread.sleep(500);
        System.out.println("Service executed");
    }
}

public class AnnotationProcessor {

    public static void main(String[] args) throws Exception {
        TestService service = new TestService();

        // Get class object
        Class<?> clazz = service.getClass();

        // Loop through all methods
        for (Method method : clazz.getDeclaredMethods()) {
            // Check if annotation exists
            if (method.isAnnotationPresent(LogExecutionTime.class)) {
                long start = System.currentTimeMillis();

                method.invoke(service); // call the method

                long end = System.currentTimeMillis();
                System.out.println("Execution Time: " + (end - start) + " ms");
            }
        }
    }
}

Service executed
Execution Time: 503 ms

------------------------------------------------------------------------


Interview Questions
===================

1. What is an annotation in Java?
---------------------------------
    Metadata that gives information about code but does not change behavior directly.


2. What is the difference between SOURCE, CLASS, RUNTIME retention?
    SOURCE: Removed before compilation
    CLASS: Stored in .class file
    RUNTIME: Accessible via Reflection


3. When do we need @Target?
    When we want to restrict annotation usage (method, class, field).


4. How does Spring work internally with annotations?
    Spring uses reflection to scan classes, detect annotations, and perform dependency injection.


5. Can annotations have default values?

Yes.

public @interface MyAnno {
    String value() default "Munna";
}


Task
=====

Create an annotation named @Author
This annotation will have TWO fields:
    name
    date


Example meaning:

@Author(name="Munna", date="12-12-2025")


Apply this annotation to a class

Example:

@Author(name = "Munna", date = "2025-12-12")
class MyClass { }


Use Reflection to read & print the annotation values
Example expected output:

Author Name: Munna
Author Date: 2025-12-12


COMPLETE TASK SOLUTION

Step 1 — Create the @Author annotation

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface Author {
    String name();
    String date();
}

Step 2 — Apply @Author to a class

@Author(name = "Munna", date = "2025-12-12")
class DemoClass {
}

Step 3 — Read the annotation using reflection

public class TestAnnotation {

    public static void main(String[] args) {
        Class<DemoClass> clazz = DemoClass.class;

        if (clazz.isAnnotationPresent(Author.class)) {
            Author author = clazz.getAnnotation(Author.class);

            System.out.println("Author Name: " + author.name());
            System.out.println("Author Date: " + author.date());
        }
    }
}

output

Author Name: Munna
Author Date: 2025-12-12

---------------------------------------------------------------------------------------------

TASK
====

Create a Custom Annotation for Logging
--------------------------------------
What does this mean?
    You must create your own annotation, similar to Spring annotations like @Autowired.

Example:

@LogExecutionTime
public void test() { }

This annotation means:

“Whenever this method runs, measure how long it takes.”


Step 1 → Create annotation
    create a file named LogExecutionTime.java.

Inside it:

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface LogExecutionTime {
}


This means:
    This annotation can be used on methods
    It will be available at runtime (important for reflection)


Apply Reflection to Read Annotation Values

What does this mean?

Reflection means:
Find out at runtime which methods have @LogExecutionTime annotation, and then do something.

In this case:
    Find the method with @LogExecutionTime
    Run the method
    Measure time taken


Step 1 → Create a class with a method using your annotation

class MyService {

    @LogExecutionTime
    public void serve() throws InterruptedException {
        Thread.sleep(500);
        System.out.println("Serving...");
    }
}


Step 2 → Use Reflection to detect the annotation

Reflection = read method information at runtime.

import java.lang.reflect.Method;

public class AnnotationProcessor {
    public static void main(String[] args) throws Exception {
        MyService service = new MyService();

        Class<?> clazz = service.getClass();

        for (Method method : clazz.getDeclaredMethods()) {

            if (method.isAnnotationPresent(LogExecutionTime.class)) {

                long start = System.currentTimeMillis();

                method.invoke(service);   // calling the method

                long end = System.currentTimeMillis();

                System.out.println("Execution Time: " + (end - start) + " ms");
            }
        }
    }
}



         */
    }
}
