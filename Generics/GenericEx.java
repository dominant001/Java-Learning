package Generics;

import java.util.ArrayList;

public class GenericEx {
    public static void main(String[] args) {

        Container<String> stringContainer = new Container<>();
        stringContainer.setValue("Hello, Generics!");
        System.out.println("String Value: " + stringContainer.getvalue());
        stringContainer.getInstanceName();

        Container2<Integer> stringContainerObj = new Container2<>();
        stringContainerObj.setValue(42);
        System.out.println("Integer Value: " + stringContainerObj.getvalue());
        stringContainerObj.getInstanceName();

        stringContainerObj.getValues(new ArrayList<Integer>());

        Container2<Number> stringContainerObj2 = new Container2<>();
        stringContainerObj2.getValue2(new ArrayList<Integer>());
    }
}

class Container<T> {
    T value;

    public T getvalue() {
        return this.value;
    }

    public void setValue(T t) {
        this.value = t;
    }

    public void getInstanceName() {
        System.out.println(value.getClass().getName());
    }
}

class Container2<T extends Number> {
    T value;

    public T getvalue() {
        return this.value;
    }

    public void setValue(T t) {
        this.value = t;
    }

    public void getInstanceName() {
        System.out.println(value.getClass().getName());
    }

    public void getValues(ArrayList<? super T> list) {

    }

    public void getValue2(ArrayList<? extends T> list) {

    }
}