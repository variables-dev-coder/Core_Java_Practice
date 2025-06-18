package day3_ObjectConstructorMemory;

public class ReferenceDemo {
    public static void main(String[] args) {
        Author author3 = new Author("Aziz", "aziz@gmail.com");

        // Two reference to the same object
        Author author4 = author3;

        author4.name = "Munna"; // Changing using second reference

        System.out.println("Author1 Name: " + author3.name);
        System.out.println("Author2 Name: " + author4.name);
    }
}
