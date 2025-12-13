package day80_Reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ReflectionDemo {

    public static void main(String[] args) throws Exception {

        // 1. Get Class object
        Class<Employee> clazz = Employee.class;

        System.out.println("Class Name: " + clazz.getName());
        System.out.println("Simple Name: " + clazz.getSimpleName());
        System.out.println("--------------------------------");

        // 2. Create Object using Reflection
        Constructor<Employee> constructor = clazz.getDeclaredConstructor();
        Employee emp = constructor.newInstance();

        System.out.println("--------------------------------");

        // 3. Get all fields
        Field[] fields = clazz.getDeclaredFields();
        System.out.println("Fields:");
        for (Field field : fields) {
            field.setAccessible(true);
            System.out.println(field.getName() + " = " + field.get(emp));
        }

        System.out.println("--------------------------------");

        // 4. Get all methods
        Method[] methods = clazz.getDeclaredMethods();
        System.out.println("Methods:");
        for (Method method : methods) {
            System.out.println(method.getName());
        }

        System.out.println("--------------------------------");

        // 5. Call public method
        Method workMethod = clazz.getDeclaredMethod("work");
        workMethod.invoke(emp);

        // 6. Call private method
        Method privateMethod = clazz.getDeclaredMethod("secretTask");
        privateMethod.setAccessible(true);
        privateMethod.invoke(emp);
    }
}

/*
Class Name: day80_Reflection.Employee
Simple Name: Employee
--------------------------------
Employee Constructor Called
--------------------------------
Fields:
id = 101
name = Munna
--------------------------------
Methods:
work
secretTask
--------------------------------
Employee is working
Private task executed
 */