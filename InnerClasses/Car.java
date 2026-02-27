package InnerClasses;

public class Car {
    private String name;
    private boolean isEngineOn;

    public Car(String name) {
        this.name = name;
    }

    class Engine {

        void start() {
            if (!isEngineOn) {
                isEngineOn = true;
                System.out.println(name + " engine started.");
            } else {
                System.out.println(name + " engine is already on.");
            }
        }

        void stop() {
            if (isEngineOn) {
                isEngineOn = false;
                System.out.println(name + " engine stopped.");
            } else {
                System.out.println(name + " engine is already off.");
            }
        }
    }
}
