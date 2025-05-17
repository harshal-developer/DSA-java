import java.util.Scanner;

public class tow_sum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [] nums = new int[5];
        for(int i = 0; i < nums.length; i++){
            nums[i] = scanner.nextInt();
        }
        System.out.println("Enter you ans : ");
        int ans = scanner.nextInt();
        for(int i = 0; i < nums.length - 1; i++){
           for(int j = i + 1 ; j < nums.length; j++){
               if(nums[i] + nums[j] == ans){
                   System.out.println("Indexes are : "+ i + " and " + j);
               }
           }
        }
    }
}
