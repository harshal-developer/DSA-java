import java.util.Scanner;

public class string_palindrome {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any string ; ");
        String str = sc.nextLine();
        boolean palindrome = checkPalindrome(str, 0, str.length() - 1);
        if(palindrome){
            System.out.println(str + " is palindrome");
        }else {
            System.out.println(str + " not palindrome");
        }
    }

    private static boolean checkPalindrome(String str, int start, int end) {
        if(start >= end){
            return true;
        }
        if(str.charAt(start) != str.charAt(end)) return false;
        return checkPalindrome(str, start + 1, end -1);
    }
}
