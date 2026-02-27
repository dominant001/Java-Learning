package Generics;

import java.lang.reflect.*;
import java.util.*;

public class GenericAndReflectionEx {
    public static void main(String[] args) throws Exception {
        Field field = Sample.class.getDeclaredField("list");
        ParameterizedType type = (ParameterizedType) field.getGenericType();
        System.out.println("Generic type: " + type.getActualTypeArguments()[0]);

    }
}

class Sample {
    List<String> list;

}
