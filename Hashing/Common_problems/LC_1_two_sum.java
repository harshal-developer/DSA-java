package Common_problems;

import java.util.Arrays;
import java.util.HashMap;

public class LC_1_two_sum {
    public static void main(String[] args) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int[] nums = {2,7,11,15};
        int target = 9;
        int[] arr = new int[2];
        for (int i = 0; i < nums.length; i++) {
            int ans = target - nums[i];
            if(map.containsKey(ans)){
                arr = new int[]{map.get(ans), i};
                break;
            }
            map.put(nums[i], i);
        }
        
        System.out.println(Arrays.toString(arr));
    }
}
