import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
//        Imperative approach
        int [] nums = {1,23,4,3,4,43};
        int sum = 0;
        for(int i = 0; i < nums.length; i++){
            sum += nums[i];
        }
        System.out.println(sum);

//        Stream :
//        Convert above approach to stream
//        int sums = Arrays.stream(nums).sum(); //sum of array elemets

        int sums = Arrays.stream(nums).filter(n -> n % 2 == 0).sum();//sum of even numbers in an array
        System.out.println(sums);

    }
}