import java.util.Scanner;

public class check_array_sorted {
    public static void main(String[] args) {
        int[] nums = new int[5];
        System.out.println("Enter the elements in the array : ");
        Scanner sc = new Scanner(System.in);
        for(int i = 0 ; i < nums.length; i++){
            nums[i] = sc.nextInt();
        }
        sc.close();
        boolean sorted = false;
        for(int i = 1 ; i < nums.length; i++){
            sorted = false;
            if(nums[i] > nums[i - 1]){
                sorted = true;
            }
        }
        if(sorted){
            System.out.println("Array is sorted");
        }else{
            System.out.println("Array is not sorted");
        }
    }
}
