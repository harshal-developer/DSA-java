package Characteristics;

import java.util.HashMap;
import java.util.Map;

public class un_ordered{
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("Apple", 2);
        map.put("Banana", 1);
        map.put("zeta", 2);
        map.put("Mango", 3);
        System.out.println(map);
    }
}