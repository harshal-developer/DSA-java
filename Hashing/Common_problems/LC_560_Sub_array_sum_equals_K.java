package Common_problems;

import java.util.HashMap;

public class LC_560_Sub_array_sum_equals_K {
    static int subarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        // Optimal version
        map.put(0, 1); //this is important : why ? -> it handles the situation where sum == k
        int count = 0; 
        int sum = 0;

        for (int num : nums){
            sum += num;
            if (map.containsKey(sum - k))
                count += map.get(sum - k);
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        } 
        return count;

        // My code : can successfully run on leetcode but not optimsed 
        // int counter = 0;
        // for(int i = 0; i < nums.length; i++){
        //     if(nums[i] == k){
        //         counter++;
        //     }
        //     int subset = k - nums[i];
        //     if(map.containsKey(subset)){
        //         map.remove(nums[i]);
        //         counter++;
        //     }
        //     map.put(nums[i], nums[i]);
        // }
        // return counter;
    }
    public static void main(String[] args) {
        int[] nums = {1, -1, 0};
        System.out.println(subarraySum(nums,0));
    }
}
