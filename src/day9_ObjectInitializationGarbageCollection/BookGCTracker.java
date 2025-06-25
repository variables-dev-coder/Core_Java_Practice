package day9_ObjectInitializationGarbageCollection;



class Book {
    static int count = 0;

    @Override
    protected void finalize() {
        count++;
        System.out.println("Book destroyed. Count = " + count);
    }
}
public class BookGCTracker {
    public static void main(String[] args) {
        Book b1 = new Book();
        Book b2 = new Book();
        Book b3 = new Book();

        b1 = null;
        b2 = null;
        b3 = null;

        System.gc();
    }
}
