package Easy_Arrays;

public class Who_appear_max_times {
    public static void main(String[] args) {
        int[] nums = {1, 1, 0, 0, 1, 0, 1, 0, 1, 1, 1, 1};
        int result = countMaxConsecutiveZeroOrOnes(nums);
        System.out.println(result);
    }
    public static int countMaxConsecutiveZeroOrOnes(int[] nums){
        int counter = 0;
        int maxCount = 0;
        int prev = -1;

        for(int i = 0; i < nums.length; i++){
            if(nums[i] == prev){
                counter++;
            }else{
                counter = 1;
                prev = nums[i];
            }
            maxCount = Math.max(maxCount, counter);
        }
        return maxCount;
    }
}
