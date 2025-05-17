package Easy_Strings;

import java.util.Scanner;

public class palindrome {
    public static boolean isPalindrome(String str){
        int left = 0;
        int right = str.length() - 1;
        while (left <= right){
            if(str.charAt(left) != str.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    public static void main(String[] args){
        System.out.println("Enter a string : ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        sc.nextLine();//extra line is always needed after int then string..tip
        String str = sc.nextLine();
        System.out.println(isPalindrome(str.toLowerCase()));
    }
}
