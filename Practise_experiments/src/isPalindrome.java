public class isPalindrome {
    public static void main(String[] args) {
        int x = 121;
        System.out.println(checkPalindrome(x));
    }
    public static boolean checkPalindrome(int x){
        if(x < 0){
            return false;
        }else{
            int rev = 0;
            int temp = x;
            int remainder = 0;
            while (temp > 0){
                remainder = temp % 10;
                rev = rev * 10 + remainder;
                temp = temp / 10;
            }
            if(rev == x){
                return true;
            }
        }
        return false;
    }
}
