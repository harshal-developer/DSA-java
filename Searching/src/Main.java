

public class Main {
    static int linearSearch(int[] nums, int target){
        if(nums.length == 0){
            return -1;
        }
        for(int i = 0 ; i < nums.length; i++){
            int element = nums[i];
            if(element == target){
//                element.isIndexOf()
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] numbers = {5,58,5,4,12,65};
        int search = 65;
        int output = linearSearch(numbers, search);
        System.out.println(output);
//        for(int elements : numbers){
//            if(search == elements){
//                System.out.println("found");
////             it keeps execute the for loop even after element is foun d
//            }
//        }
    }
}