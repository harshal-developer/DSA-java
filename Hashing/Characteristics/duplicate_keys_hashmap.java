package Characteristics;
import java.util.HashMap;

public class duplicate_keys_hashmap {

    public static void main(String[] args) {
        HashMap<Integer, String> hashMap = new HashMap<>();
        hashMap.put(1, "harshal");
        hashMap.put(1, "aaa");
        hashMap.put(1, "cc");
        System.out.println(hashMap.size());
        System.out.println(hashMap);
    }
}
