package day79_Annotation;



@Author(name = "Munna", date = "2025-12-12")
class DemoClass {
}

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

//Author Name: Munna
//Author Date: 2025-12-12