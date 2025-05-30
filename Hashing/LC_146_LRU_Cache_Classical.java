

import java.util.LinkedHashMap;
import java.util.Map;
// Use below rather than class LRUCache<k,v> extends LinkedHashMap<k, v>
class LRUCache extends LinkedHashMap<Integer, Integer> {
    protected int capacity;

    LRUCache(int capacity) {
        super(capacity, 0.75f, true);
        this.capacity = capacity;
    }

    public int get(int key) {
        return super.getOrDefault(key, -1);
    }

    public void put(int key, int value) {
        super.put(key, value);
    }

    @Override
    public boolean removeEldestEntry(Map.Entry<Integer, Integer> Eldest) {
        return size() > capacity;
    }

    public void display() {
        for (Map.Entry<Integer, Integer> entry : super.entrySet()) {
            System.out.print(entry.getKey() + "=" + entry.getValue() + " ");
        }
    }
}

public class LC_146_LRU_Cache_Classical {
    public static void main(String[] args) {
        LRUCache cache = new LRUCache(2);
        cache.put(1, 12); // [1]
        cache.put(2, 24); // [1, 2]
        cache.put(3, 21); // 1 removed → [2, 3]
        cache.get(1); // 1 not in cache → -1
        cache.display(); // Output: 2=24 3=21

    }
}
