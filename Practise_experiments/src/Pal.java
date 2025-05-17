public class Pal {
    public boolean isPalindrome(String s) {
        int left = 0;
        int right = 0;
        while(left <= right){
            if(s.charAt(left) != s.charAt(right)){
                return false;
            }
            left ++;
            right --;
        }

        return true;
    }
    public static void main(String[] args) {

    }
}
