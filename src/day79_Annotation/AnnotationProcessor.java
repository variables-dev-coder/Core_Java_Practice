package day79_Annotation;


import java.lang.reflect.Method;

class MyService {

    @LogExecutionTime
    public void serve() throws InterruptedException {
        Thread.sleep(500);
        System.out.println("Serving...");
    }
}

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
