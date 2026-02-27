package SolidDesignPrincipal;

public class LSP {

    public static void main(String[] args) {
        MenuItems item1 = new MenuItems("Burger", 149, "Delicious beef burger");
        MenuItems item2 = new MenuItems("Fries", 69, "Crispy golden fries");
        Beverage beverage = new Beverage("Soda", 100, "Refreshing soda drink");
        printPrice(item1);
        printPrice(item2);
        printPrice(beverage);
    }

    public static void printPrice(MenuItems item) {
        System.out.println("Item: " + item.getName() + ", Price: " + item.getPrice());
    }

    public static class MenuItems {
        public String name;
        public String description;
        public double price;

        public MenuItems(String name, double price, String description) {
            this.name = name;
            this.price = price;
            this.description = description;
        }

        public String getName() {
            return name;
        }

        public double getPrice() {
            return price - this.getDiscount();
        }

        private double getDiscount() {
            return 0;
        }

        public String getDescription() {
            return description;
        }
    }

    public static class Beverage extends MenuItems {

        public Beverage(String name, double price, String description) {
            super(name, price, description);

        }

        public double getPrice() {
            return price - this.getDiscount();
        }

        private double getDiscount() {
            double discount = 0.1; // 10% discount
            return price * discount; // 10% discount
        }
    }
}
