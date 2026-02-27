package DesignPatterns;

import java.lang.reflect.Constructor;

public class SingeltonEx {

    public static void main(String[] args) throws Exception {

        SingeltonData obj = SingeltonData.getInstance();
        System.out.println(obj.hashCode());
        SingeltonData obj2 = SingeltonData.getInstance();
        System.out.println(obj2.hashCode());

        // how to break singelton design pattern

        // 1. using reflection api
        //solution 1 -> if object is already created then throw exception from constructor
        //solution 2 -> using enum class

        SingeltonData obj1 = SingeltonData.getInstance();
        System.out.println(obj1.hashCode());

        Constructor<SingeltonData> constructor = SingeltonData.class.getDeclaredConstructor();
        constructor.setAccessible(true);
        SingeltonData obj3 = constructor.newInstance();
        System.out.println(obj3.hashCode());

        // 2. using serialization and deserialization



    }
}

class SingeltonData {
    private static SingeltonData instance;

    private SingeltonData() {

    }

    public static SingeltonData getInstance() {
        if (instance == null) {
            instance = new SingeltonData();
        }
        return instance;
    }
}