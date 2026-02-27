package InnerClasses;

public class ShoppingCart {
    private double totalPrice;

    public ShoppingCart(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public void processpayment(Payment payment) {
        payment.makePayment(totalPrice);
    }
}

interface Payment {
    void makePayment(double amount);
}
