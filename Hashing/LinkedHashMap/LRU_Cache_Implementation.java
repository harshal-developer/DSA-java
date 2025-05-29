package LinkedHashMap;

import java.util.LinkedHashMap;
import java.util.Map;

class LRUCache<k, v> extends LinkedHashMap<k, v>{
    // this is generic class : due to k, v
    private int capacity;
    public LRUCache(int capacity){
        super(capacity, 0.75f, true);
        // IMP : accessOrder = true-> recentyly get() item show latest and least used removed 
        // if you make accessOrder = false .. then accessed element cannot go to latest position, it stays its default position 
        this.capacity = capacity;
    }

    @Override
    protected boolean removeEldestEntry(Map.Entry<k,v> eldest){
        // this function calls after every put call
        return size() > capacity; //remove oldest if size exceeds
    }

    // get method 
    public v getValue(k Key){
        return super.getOrDefault(Key, null);
    }

    //put method 
    public void putValue(k key, v value){
        super.put(key, value);
    }

    //print values 
    public void display(){
        for(Map.Entry<k, v> entry : super.entrySet()){
            System.out.print(entry.getKey() + "=" + entry.getValue() + " ");
        }
        System.out.println("");
    }
}
public class LRU_Cache_Implementation {
    public static void main(String[] args) {
        LRUCache<Integer, String> cache = new LRUCache<>(3);
        cache.putValue(2, "harshal");
        cache.putValue(1, "Neha");
        cache.putValue(4, "Zaid");

        cache.display();
        // 2=harshal, 1=Neha, 4=zaid
        System.out.println(cache.getValue(1)); //here we used 1=Neha(accessed latest)

        cache.getValue(5);
        cache.display();
        // 4=Zaid, 1=Neha, 4=Last (not worked on 2=Harshal so it gets removed)

    }
}
