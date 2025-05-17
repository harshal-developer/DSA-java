import java.util.Arrays;
import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args){
//        System.out.println("Please enter the number :");
        Scanner sc = new Scanner(System.in);
//        int no = sc.nextInt();
//        int remainder = 0;
//        int sum = 0;
//        int temp = no;
//        while (temp > 0){
//            remainder = temp % 10;
//            sum = sum + remainder * remainder * remainder;
//            temp = temp / 10;
//        }
//        if(sum == no){
//            System.out.println(no + " is armstrong");
//        }else{
//            System.out.println(no + " is not armstrong");
//        }

//        armstrong no in an array
        System.out.println("Enter an array of 5 digits :");
        int [] numbers = new int[5];
        for(int i = 0; i < numbers.length; i++){
            numbers[i] = sc.nextInt();
        }
        int temp = 0;
        int armarray[] = new int[5];
        for (int i = 0; i < numbers.length; i++) {
            int num = numbers[i];
            int sum = 0;
            int originalNum = num;

            while (num > 0) {
                int remainder = num % 10;
                sum += remainder * remainder * remainder;
                num /= 10;  // Correctly update num to the next digit
            }

            // Check if the number is an Armstrong number
            if (sum == originalNum) {
                armarray[i] = originalNum;
            } else {
                armarray[i] = 0;  // Or you can leave it as 0 or any other placeholder
            }
        }

        System.out.println("Armstrong numbers in the array:");
        for (int j = 0; j < armarray.length; j++) {
            if (armarray[j] != 0) {
                System.out.println(armarray[j]);
            }
        }
    }

}
