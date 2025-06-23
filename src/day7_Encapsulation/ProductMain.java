package day7_Encapsulation;

public class ProductMain {
    public static void main(String[] args) {
        Product p = new Product();

        p.setProductId(101);
        p.setProductName("keybord");
        p.setPrice(299.0);
        p.setQuantity(1);

        p.displayProductInfo();
    }
}
