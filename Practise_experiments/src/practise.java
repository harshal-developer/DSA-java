import java.io.BufferedReader;
import java.util.Scanner;

public class practise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number : ");

        int no = sc.nextInt();
//        square root of number
        if(no > 0){
            int i = 1;
            int remainder = 0;
            while(i <= no){
                remainder = no % i;
                if(remainder == 0 && no / i == i){
                    System.out.println("square root of " + no + " is: "+ i);
                    break;
                }
                i++;
            }
        }
    }
}
