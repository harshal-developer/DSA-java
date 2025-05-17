public class second_largest {
    public static void main(String[] args) {
        int[] nums = {4,11,14,12,15};

        System.out.println(findSecondLargest(nums));;
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE);
    }

    private static int findSecondLargest(int[] nums){
        int largestValue = Integer.MIN_VALUE;
        int secondLargestValue = Integer.MIN_VALUE;
//        why we taking minval : beacuase array contains -4, -5 etc then how we know the second largest no : go it ?

        for(int i = 0; i < nums.length; i++){
            int current = nums[i];
            if(current > largestValue){ // here we get max8
                secondLargestValue = largestValue;
                largestValue = current;
            }else if(current > secondLargestValue && largestValue != current) {
                secondLargestValue = current;
            }
        }
        return secondLargestValue;
    }
}
