package InnerClasses;

public class Computer {

    private String brand;
    private String model;
    private OperatingSystem os;

    public Computer(String brand, String model, String osName) {
        this.brand = brand;
        this.model = model;
        this.os = new OperatingSystem(osName);
    }

    public OperatingSystem getOperatingSystem() {
        return os;
    }

    static class USB {
        private String type;

        public USB(String type) {
            this.type = type;
        }

        public void connect() {
            System.out.println("USB Type " + type + " connected.");
        }
    }

    class OperatingSystem {

        private String osName;

        public OperatingSystem(String osName) {
            this.osName = osName;
        }

        public void displayInfo() {
            System.out.println("Computer Brand: " + brand);
            System.out.println("Computer Model: " + model);
            System.out.println("Operating System: " + osName);
        }
    }
}
