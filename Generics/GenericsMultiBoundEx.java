package Generics;

interface Printable {
    void print();
}

class MyNumber extends Number implements Printable {

    private final int value;

    public MyNumber(int value) {
        this.value = value;
    }

    public void display() {
        System.out.println("Value in display: " + value);
    }

    @Override
    public void print() {
        System.out.println("Value in print: " + value);
    }

    @Override
    public double doubleValue() {
        return value;
    }

    @Override
    public float floatValue() {
        return value;
    }

    @Override
    public int intValue() {
        return value;
    }

    @Override
    public long longValue() {
        return value;
    }
}

class Boxx<T extends Number & Printable> {

    private T value;

    public Boxx(T value) {
        this.value = value;
    }

    public void show() {
        value.print();
    }

    public void printVal() {
        System.err.println("Value in Box printVal: " + value);
    }
}

public class GenericsMultiBoundEx {

    public static void main(String[] args) {
        MyNumber number = new MyNumber(10);
        Boxx<MyNumber> box = new Boxx<>(number);
        box.show();
    }
}
