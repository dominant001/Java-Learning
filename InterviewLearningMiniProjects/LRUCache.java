package InterviewLearningMiniProjects;

import java.util.LinkedHashMap;
import java.util.Map;

public class LRUCache<K, V> extends LinkedHashMap<K, V> {
    private final int capacity;

    public LRUCache(int capacity) {
        // initialCapacity, loadFactor, accessOrder=true (for LRU)
        super(capacity, 0.75f, true);
        this.capacity = capacity;
    }

    @Override
    protected boolean removeEldestEntry(Map.Entry<K, V> eldest) {
        return size() > capacity; // Evict when capacity exceeded
    }

    public static void main(String[] args) {
        LRUCache<Integer, String> cache = new LRUCache<>(3);

        cache.put(1, "A");
        cache.put(2, "B");
        cache.put(3, "C");
        System.out.println(cache); // {1=A, 2=B, 3=C} old to new -> 1,2,3

        cache.get(1); // Access key 1 → makes it most recently used old to new -> 2,3,1
        cache.put(4, "D"); // Evicts key 2 (least recently used)
        System.out.println(cache); // {3=C, 1=A, 4=D} old to new -> 3,1,4
        cache.put(5, "E");
        System.out.println(cache); // {1=A, 4=D, 5=E} old to new -> 1,4,5

    }
}