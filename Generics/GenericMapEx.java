package Generics;

public class GenericMapEx {

    public static void main(String[] args) {
        Pair<String, Integer> mapObj = new Pair<>("Age", 27);
        System.out.println("Key: " + mapObj.getKey() + ", Value: " + mapObj.value());
    }
}

class Pair<K, V> {
    private K key;
    private V value;

    public Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public V value() {
        return value;
    }
}