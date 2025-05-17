package Easy_Arrays;

import java.util.Arrays;

public class move_zero_at_the_end {
    public static void main(String[] args){
        int[] nums =  {1, 2, 0, 4, 3, 0, 5, 0};

        int k = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] != 0){
                int temp = nums[i];
                nums[i] = nums[k];
                nums[k] = temp;
                k++;
            }
        }

        System.out.println(Arrays.toString(nums));
    }
}
