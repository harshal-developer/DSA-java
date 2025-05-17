import java.util.Random;
import java.util.Scanner;

public class randomPasswordGenerator {
    public static void main(String[] args){
        System.out.println("Enter the length of password : ");
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        System.out.println(generatePassword(length));
    }

    static char[] generatePassword(int length){
        String capitalLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String smallLetters = "abcdefghijklmnmopqrstuvwxyz";
        String specialCharacters = "@#&";
        String numbers = "1234567890";

        String combined = capitalLetters + smallLetters + specialCharacters + numbers;

        Random rand = new Random();

        char[] password = new char[length];
        System.out.println(rand.nextInt(smallLetters.length()));

        password[0] = smallLetters.charAt(rand.nextInt(smallLetters.length()));
        password[1] = capitalLetters.charAt(rand.nextInt(capitalLetters.length()));
        password[2] = specialCharacters.charAt(rand.nextInt(specialCharacters.length()));
        password[3] = numbers.charAt(rand.nextInt(numbers.length()));

        for(int i = 0 ; i < length; i++){
            password[i] = combined.charAt(rand.nextInt(combined.length()));
        }

        return  password;
    }
}
