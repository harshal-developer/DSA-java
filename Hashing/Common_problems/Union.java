package Hashing.Common_problems;

import java.util.HashSet;

public class Union {
    public static void main(String[] args) {
        int[] nums = {23,21,1,23,23,12,0,1,12};

        HashSet<Integer> set = new HashSet<>();
        for(int num : nums){
            set.add(num);
        }
        System.out.println(set);
    }
}
