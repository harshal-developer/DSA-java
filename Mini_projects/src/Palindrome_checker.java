import java.util.Scanner;
public class Palindrome_checker {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number");
        int no = sc.nextInt();

        int sum = 0 ;
        int rev = 0;
        int remainder = 0;
        int temp = no;
        while(temp > 0){
            remainder = temp % 10;
            rev = rev * 10 + remainder;
            temp = temp / 10;
        }
        if(rev == no){
            System.out.println(no + " is palindrome no ");
        }else{
            System.out.println(no + " not palindorme");
        }
    }
}
