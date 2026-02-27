package SolidDesignPrincipal;

import java.util.List;

/*if i have not segregated the save bill() method which only uses the billId and 
it is also used in constructer from the class Bill then it vioalates the SRP*/

public class SRP {
    public static void main(String[] args) {
        Menu item1 = new Menu("Burger", 5.99);
        Menu item2 = new Menu("Fries", 2.99);
        new Menu("Soda", 1.49);
        List<Menu> items = List.of(item1, item2);
        Bill bill = new Bill(items, "Ankit", "2024-10-10 12:00 PM");
        double total = bill.generateInvoice(items);
        System.out.println("Total Amount: " + total);
    }
}

class Checkout {
    public static void main(String[] args) {
        Menu item1 = new Menu("Burger", 2.99);
        Menu item2 = new Menu("Fries", 1.99);
        new Menu("Soda", 1.49);
        List<Menu> items = List.of(item1, item2);
        Bill bill = new Bill(items, "Sanjay", "2024-10-10 12:00 PM");
        double total = bill.generateInvoice(items);
        // Generate and Save to DB
        SaveBill saveBill = new SaveBill("BILL123", bill, total);
        saveBill.save();
    }
}

class Bill {

    private List<Menu> items;
    private String custName;
    private String timeStamp;

    public Bill(List<Menu> items, String custName, String timeStamp) {
        this.items = items;
        this.custName = custName;
        this.timeStamp = timeStamp;
    }

    // getters
    public List<Menu> getItems() {
        return items;
    }

    public String getCustName() {
        return custName;
    }

    public String getTimeStamp() {
        return timeStamp;
    }

    public double generateInvoice(List<Menu> items) {
        double total = 0;
        for (Menu item : items) {
            System.out.println(item.getItemName() + " : " + item.getPrice());
            total += item.getPrice();
        }
        return total;

    }

    public void printBill() {
        System.out.println("Bill for " + custName + " at " + timeStamp);
    }

    public void saveBill() {
        System.out.println("Bill saved for " + custName + " at " + timeStamp);
    }
}

class SaveBill {
    private String billId;
    private Bill bill;
    private double billAmount;

    public SaveBill(String billId, Bill bill, double billAmount) {
        this.billId = billId;
        this.bill = bill;
        this.billAmount = billAmount;
    }

    public void save() {
        System.out
                .println("Bill " + billId + " saved with amount " + billAmount + " Rs for Customer "
                        + bill.getCustName());
    }
}

class Menu {

    private String itemName;
    private double price;

    public Menu(String itemName, double price) {
        this.itemName = itemName;
        this.price = price;
    }

    public String getItemName() {
        return itemName;
    }

    public double getPrice() {
        return price;
    }
}
