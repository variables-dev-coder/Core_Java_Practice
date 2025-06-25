package day9_ObjectInitializationGarbageCollection;


class Product {
    int id;
    String name;
    double price;

    Product(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    void displayProductInfo() {
        System.out.println("Product Id: " + id + ", Product Name: " + name + ", Product Price: " + price);
    }
}
public class ProductMain {
    public static void main(String[] args) {

        Product pp = new Product(67152, "Wire Less Mouse", 399);
        pp.displayProductInfo();
    }
}
