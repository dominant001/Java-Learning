package InnerClasses;

public class InnerClassEx {
    public static void main(String[] args) {

        // member inner class example
        Car car = new Car("Toyota");
        Car.Engine engine = car.new Engine();
        engine.start();
        engine.stop();

        // static nested class example
        Computer computer = new Computer("Dell", "XPS 13", "Windows 10");
        computer.getOperatingSystem().displayInfo();

        Computer.USB usb = new Computer.USB("Type-C");
        usb.connect();

        // Anonymous inner class example
        ShoppingCart cart = new ShoppingCart(150.75);

        cart.processpayment(new Payment() {
            @Override
            public void makePayment(double amount) {
                System.out.println("Payment of $" + amount + " processed using PayPal.");
            }
        });

        // Local inner class example
        Hotel hotel = new Hotel("Grand Plaza", 100, 90);
        hotel.reserveRoom("Ankit", 1);
        hotel.reserveRoom("John", 10);

    }
}
