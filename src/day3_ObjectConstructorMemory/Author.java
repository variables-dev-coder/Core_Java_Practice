package day3_ObjectConstructorMemory;

public class Author {
    String name;
    String email;

    Author(String name, String email){
        this.name = name;
        this.email = email;
    }

    void displayAuthor(){
        System.out.println("Author: " + name + ", Email: " + email);
    }
}
