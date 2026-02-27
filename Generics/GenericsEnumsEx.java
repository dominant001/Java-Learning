package Generics;

public class GenericsEnumsEx {

    public static void main(String[] args) {

        double res = Operation.MULTIPLY.apply(5, 3);
        System.out.println("res : " + res);
    }
}

enum Operation {

    ADD, SUBTRACT, MULTIPLY, DIVIDE;

    public <T extends Number> double apply(T a, T b) {

        switch (this) {
            case ADD:
                return a.doubleValue() + b.doubleValue();

            case SUBTRACT:
                return a.doubleValue() - b.doubleValue();

            case MULTIPLY:
                return a.doubleValue() * b.doubleValue();

            case DIVIDE:
                return a.doubleValue() / b.doubleValue();

            default:
                return 0;
        }
    }
}
