package day10_modifiers_packages.test;

import day10_modifiers_packages.mypackage.Message;  // import from other package

public class MessageTest {
    public static void main(String[] args) {
        Message msg = new Message();
        msg.greet();  // Output: Hello Munna! Welcome to Java Package
    }
}
