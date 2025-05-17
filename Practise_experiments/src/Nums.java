import java.util.Arrays;

public class Nums {
    public static void main(String[] args) {
        int[] nums = {0,2,1,5,3,4};

//        without extra space
        int size = nums.length;
        for(int i = 0; i < size; i++){
            nums[i] = nums[i] + (nums[nums[i]] % size) * size;
        }

        for(int i = 0; i < size; i++){
            nums[i] = nums[i] / size;
        }
        System.out.println(Arrays.toString(nums));
//        int[] arr = new int[nums.length];
//        for(int i = 0; i < nums.length; i++){
//            arr[i] = nums[nums[i]];
//        }
//
//        System.out.println(Arrays.toString(arr));
    }
}
