package Hashing.Common_problems;

import java.util.HashMap;

public class frequency_counter{
    public static void main(String[] args) {
        int[] nums = {2, 3, 2, 4, 3, 2};

        HashMap<Integer, Integer> map = new HashMap<>();

        for(int num : nums){
            if(map.containsKey(num)){
                map.put(num, map.get(num) + 1);
            }else{
                map.put(num, 1);
            }
        }

        for(int key : map.keySet()){
            System.out.println(key + " : " + map.get(key) + " times");
        }
    }
}