package day5_Polymorphism;


class BillCalculator {

    // Total without discount

   double generateBill(int quantity, double pricePerItem) {
        return quantity * pricePerItem;
    }

    // Total with discount percentage

    double generateBill(int quantity, double pricePerItem, double discount) {
        double total = quantity * pricePerItem;
        double discountAmount = (discount / 100) * total;
        return total - discountAmount;
    }

    // Return bill details as a String

    String generateBill(String itemName, int quantity, double pricePerItem) {
        double total = quantity * pricePerItem;
        return "Item: " + itemName + ", Quantity: " + quantity + ", Total: " + total;
    }
}
public class Overloading_BillCalculator {
    public static void main(String[] args) {

        BillCalculator bc = new BillCalculator();

        // Simple bill
        double total1 = bc.generateBill(5, 20.0);
        System.out.println("Total without discount: " + total1);

        // Bill with discount
        double total2 = bc.generateBill(5, 20.0, 10); // 10% discount
        System.out.println("Total with 10% discount: " + total2);

        // Bill with item name
        String billInfo = bc.generateBill("Notebook", 3, 50.0);
        System.out.println(billInfo);

    }
}
