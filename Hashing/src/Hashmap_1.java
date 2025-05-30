import java.util.*;

public class Hashmap_1 {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
//        ArrayList<Integer> arr = new ArrayList<>();
//        LinkedList<Integer> ls = new LinkedList<>();

        
        map.put(12, "text12");
        map.put(5, "text3");
        map.put(1, "text1");


//        System.out.println(map.get(3));
//        System.out.println(map.containsKey(54));
//        System.out.println(map.containsValue("Neha"));

//        if you want want to print hashmap in loop ,,use set

        Set<Integer> integers = map.keySet();

        System.out.println(map);
//        option 1
        for(int i : integers){
//            System.out.println(map.get(i));
        }
//        option 2
        Set<Map.Entry<Integer, String>> entries = map.entrySet();
        for(Map.Entry<Integer, String> entry : entries){ //it gets each entry -> each entry
//            System.out.println(map.get(entry));//null
//            use this :
//            System.out.println(entry.getKey() + " : " + entry.getValue());
//            entry.setValue("okk"); //ok applied to every entry or record

//            System.out.println(entry.getValue().toUpperCase());
        }
//        System.out.println(map);

//        delete
//        map.remove(3, "fff"); //false
//        map.remove(5); //removed;
//        map.remove(5, "text3");

        System.out.println(map);



    }

}
