package day64_Lambdas;


@FunctionalInterface
interface Greeting {
    void sayHello(String name);
}

public class LambdaFI {
    public static void main(String[] args) {
        Greeting greet = name -> System.out.println("Hello " + name);
        greet.sayHello("Munna");
    }
}
