import java.util.Scanner;
import java.util.Random;

public class generate_random_numbersss {
    public static void main(String[] args) {
        System.out.println("How many ranodm numbers do you want to generate : ");
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        Random rand = new Random();
        for (int i = 1; i <= input; i++) {
            int number = rand.nextInt(100) + 1;
            System.out.print(number + " ");
        }
        sc.close();
    }
}
