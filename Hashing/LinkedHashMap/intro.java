package LinkedHashMap;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class intro {

    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Amit", 10);
        map.put("Neha", 10);
        map.put("Zaid", 20);

        System.out.println(map); // insertion order change 
        // {Neha=10, Amit=10, Zaid=20}

        // uses LinkedHashMap =  HashMap (hash table) + DLL (for order maintain)
        LinkedHashMap<String, Integer> lmap = new LinkedHashMap<>();
        lmap.put("Amit", 10);
        lmap.put("Neha", 12);
        lmap.put("Zaid", 30);
        System.out.println(lmap); // insertion order maintained ...thats it 
        // {Amit=10, Neha=12, Zaid=30}
        
    }
}
