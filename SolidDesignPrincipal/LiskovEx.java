package SolidDesignPrincipal;

public class LiskovEx {
    public static void main(String[] args) {
        MenuItems item1 = new MenuItems("Burger", 5.99, "Delicious beef burger");
        MenuItems item2 = new MenuItems("Fries", 2.99, "Crispy golden fries");
        Beverage beverage = new Beverage("Soda", 1.49, "Refreshing soda drink");

        printPrice(item1);
        printPrice(item2);
        printPrice(beverage);
    }

    public static class MenuItems {
        private String name;
        public String description;
        private double price;

        public MenuItems(String name, double price, String description) {
            this.name = name;
            this.price = price;
            this.description = description;
        }

        public String getName() {
            return name;
        }

        public double getPrice() {
            return price;
        }

        public String getDescription() {
            return description;
        }
    }

    public static class Beverage extends MenuItems {

        public Beverage(String name, double price, String description) {
            super(name, price, description);

        }

        public double priceWithDiscount(double discount) {
            return getPrice() - (getPrice() * discount / 100);
        }
    }

    public static void printPrice(MenuItems item) {

        if (item instanceof Beverage) {
            Beverage beverage = (Beverage) item;
            System.out.println(
                    "Item: " + beverage.getName() + ", Price after discount: " + beverage.priceWithDiscount(10));
            return;
        }
        System.out.println("Item: " + item.getName() + ", Price: " + item.getPrice());
    }
}
