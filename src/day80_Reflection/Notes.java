package day80_Reflection;

public class Notes {
    public static void main(String[] args) {


        /*

Reflection: Basic Introspection of Classes at Runtime
=====================================================

1. What is Reflection?
    Reflection = ability of Java program to examine itself at runtime

Using Reflection, you can:
    Find class name
    Find methods, fields, constructors
    Know modifiers (public, private)
    Create objects dynamically
    Call methods dynamically

Frameworks like Spring, Hibernate, JUnit use Reflection heavily.


2. Why Reflection is Needed?

Normally:

    MyClass obj = new MyClass();
    obj.method();

But with Reflection:

    Class<?> clazz = Class.forName("MyClass");
    Object obj = clazz.getDeclaredConstructor().newInstance();

Class name not known at compile time
Decides behavior at runtime
Enables frameworks, plugins, AOP, DI



3. Getting Class Object (3 Ways)

Way 1 – Using .class

Class<MyService> c1 = MyService.class;

Way 2 – Using getClass()

MyService service = new MyService();
Class<?> c2 = service.getClass();

Way 3 – Using Class.forName()

Class<?> c3 = Class.forName("day80_reflection.MyService");

All three give the same Class object



4. Introspecting Class Information

Sample Class (Target for Reflection)

package day80_reflection;

public class MyService {

    private String name = "Munna";

    public MyService() {}

    public void serve() {
        System.out.println("Serving...");
    }

    private void secret() {
        System.out.println("Secret Method");
    }
}


5. Get Class Name & Package

Class<?> clazz = MyService.class;

System.out.println(clazz.getName());
System.out.println(clazz.getSimpleName());
System.out.println(clazz.getPackage().getName());


6. Get All Methods (Introspection)

import java.lang.reflect.Method;

Class<?> clazz = MyService.class;

Method[] methods = clazz.getDeclaredMethods();

for (Method method : methods) {
    System.out.println(method.getName());
}

getDeclaredMethods() → includes private methods


7. Get Fields (Introspection)

import java.lang.reflect.Field;

Field[] fields = clazz.getDeclaredFields();

for (Field field : fields) {
    System.out.println(field.getName());
}


8. Get Constructors

import java.lang.reflect.Constructor;

Constructor<?>[] constructors = clazz.getDeclaredConstructors();

for (Constructor<?> constructor : constructors) {
    System.out.println(constructor);
}


9. Access Private Field (Important)

MyService service = new MyService();

Field field = clazz.getDeclaredField("name");
field.setAccessible(true);

System.out.println(field.get(service));


setAccessible(true) breaks encapsulation
Used by frameworks only.


10. Call Method Using Reflection

Method method = clazz.getDeclaredMethod("serve");
method.invoke(service);

Call Private Method:

Method method = clazz.getDeclaredMethod("secret");
method.setAccessible(true);
method.invoke(service);


11. Real-Time Use Case (Mini Example)

for (Method method : clazz.getDeclaredMethods()) {
    if (method.getName().startsWith("serve")) {
        method.invoke(service);
    }
}


Dynamic method execution
Plugin-style behavior


12. Reflection Limitations

Slower than normal calls
Breaks encapsulation
Security risk if misused

Use only when necessary

13. Interview Questions (Day 80)

Q1. What is Reflection?
    Ability to inspect and manipulate classes at runtime.

Q2. Difference between getMethods() and getDeclaredMethods()?
    getMethods() → public + inherited
    getDeclaredMethods() → all declared methods

Q3. Why is Reflection slow?
    Because JVM cannot optimize reflective calls easily.

Q4. Where is Reflection used?
    Spring, Hibernate, JUnit, Jackson, AOP, Dependency Injection


         */
    }
}
