package Hashing.Common_problems;

import java.util.HashMap;

public class check_duplicates {
    public static void main(String[] args){
        int[] nums = {2,3,43,3,32,34,34};

        HashMap<Integer, Boolean> map = new HashMap<>();
        boolean isDuplicate = false;
        for(int num : nums){
            if(map.containsKey(num)){
                isDuplicate = true;
            }
            map.put(num, true);
        }

        if(isDuplicate){
            System.out.println("Duplicate found");
        }else{
            System.out.println("not found");
        }
    }
}
