package day4_Inheritance;



class Book3 {
    String title;
    String author;

    Book3(String title, String author) {
        this.title = title;
        this.author = author;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true; // check same reference
        if (obj == null || getClass() != obj.getClass()) return false;

        Book3 other = (Book3) obj;
        return this.title.equals(other.title) && this.author.equals(other.author);
    }
}

public class EqualsMethodBook {
    public static void main(String[] args) {
        Book3 b1 = new Book3("Java Basics", "Munna");
        Book3 b2 = new Book3("Java Basics", "Munna");
        Book3 b3 = new Book3("Spring Boot", "Aziz");

        System.out.println(b1.equals(b2)); //  true
        System.out.println(b1.equals(b3)); //  false
    }
}

