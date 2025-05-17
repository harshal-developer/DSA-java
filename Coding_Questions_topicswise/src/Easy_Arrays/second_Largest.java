package Easy_Arrays;

public class second_Largest {
    public static void main(String[] args){
        int[] nums = {10, 35, 1, 10, 34, 1};
        int result = findSecondLargest(nums);
        System.out.println(result + " is the second largest in an given array");
    }

    public static int findSecondLargest(int[] nums){
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        for(int num : nums){
            if(num > largest){
                secondLargest = largest;
                largest = num;
            }else if(num > secondLargest && num != largest){
                secondLargest = num;
            }
        }

        return secondLargest == Integer.MIN_VALUE ? -1 : secondLargest;
    }
}
