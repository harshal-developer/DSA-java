public class count_even_odd {
    public static void main(String[] args) {
        int[] nums = {2,34,4,45,5,7,78};

        int eventCount = countEventNums(nums);
        int oddcounter = nums.length - eventCount;

        System.out.println("Even numbers in array are : " + eventCount);
        System.out.println("Odd numbers in array are : " + oddcounter);
    }
    private static int countEventNums(int[] nums){
        int count = 0;

        for(int no : nums){
            if(no % 2 == 0){
                count++;
            }
        }
        return count;
    }
}
