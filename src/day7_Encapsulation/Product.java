package day7_Encapsulation;



public class Product {

    private int productId;
    private String productName;
    private double price;
    private int quantity;


    // Getter for Product Id
    public int getProductId() {
       return productId;
    }

    // Setter for Product Id
    public void setProductId(int productId) {
        this.productId = productId;
    }

    // Getter for Product Name
    public String getProductName() {
        return productName;
    }

    // Setter for Product Name
    public void setProductName(String productName) {
        this.productName = productName;
    }

    // Getter for Product Price
    public double getPrice() {
        return price;
    }

    // Setter for Product Price
    public void setPrice(double price) {
        this.price = price;
    }

    // Getter for Quantity
    public int getQuantity() {
        return quantity;
    }

    // Setter for Price
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    // Method for displayProductInfo()
    void displayProductInfo() {
        System.out.println("Product Id: " + productId + ", Product Name: "
                                        + productName + ", Product Price: "
                                        + price + ", Product Quantity: "
                                        + quantity);
    }
}
