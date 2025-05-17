package Easy_Arrays;

public class third_Largest {
    public static void main(String[] args){
        int[] nums = {10,2};;
        int result = findThirdLargest(nums);
        System.out.println(result + " is the third largest in an array");
    }

    public static int findThirdLargest(int[] nums){
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        int thirdLargest = Integer.MIN_VALUE;

        for(int i = 0; i < nums.length; i++){
            if(nums[i] > largest){
                thirdLargest = secondLargest;
                secondLargest = largest;
                largest = nums[i];
            }else if(nums[i] > secondLargest && nums[i] != largest){
                thirdLargest = secondLargest;
                secondLargest = nums[i];
            }else if(nums[i] > thirdLargest && nums[i] != secondLargest){
                thirdLargest = nums[i];
            }
        }

        return thirdLargest != Integer.MIN_VALUE ? thirdLargest :  largest;
    }
}
