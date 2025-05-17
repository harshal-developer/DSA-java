import java.util.Random;
import java.util.Scanner;

public class Number_Guessing_System {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("******************************");
        System.out.println("Computer has generated a random number. You have only three attempts to guess the number: ");
        System.out.println("******************************");
        Random rand = new Random();
        int a = rand.nextInt(100);
        System.out.println(a);
        System.out.println("Enter you guess : ");
        int attempts = 3;
        int i = 1;
        while(attempts >= 1){
            int guess = sc.nextInt();
            if(guess == a){
                System.out.println("You gussed it right. Computer has generated "+a);
                break;
            }else{
                attempts--;
                if(attempts == 0){
                    System.out.println("BYW...No genrated by computer is : "+a);
                    System.out.println("You have "+ attempts + "attempts left. \nBetter luck next time!!!!!!!!!!!");
                    break;
                }
                System.out.println("you have only " + attempts + " attempts left");
            }
        }
    }
}
