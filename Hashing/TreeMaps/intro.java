package TreeMaps;

import java.util.Map;
import java.util.TreeMap;

public class intro {
    public static void main(String[] args) {
        TreeMap<Integer, String> map = new TreeMap<>();
        map.put(34, "Harshal");
        map.put(21, "Neha");
        map.put(3, "S");
        // System.out.println(map);
        for(Map.Entry<Integer, String> entry : map.entrySet()){
            System.out.print(entry.getKey() + "=" + entry.getValue() + " ");
        }
    }
}
