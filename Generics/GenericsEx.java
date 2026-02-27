package Generics;

public class GenericsEx {

    public static void main(String[] args) {
        Box<Integer> inObj = new Box<>();
        inObj.setValue(123);
        System.out.println("Integer Value: " + inObj.getValue());

        Box<String> strObj = new Box<>();
        strObj.setValue("Hello Generics");
        System.out.println("String Value: " + strObj.getValue());
    }
}

class Box<T> {
    private T value;

    public void setValue(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }
}
