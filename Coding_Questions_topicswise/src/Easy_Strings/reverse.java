package Easy_Strings;

public class reverse {
    //    option 1 : uae setCahrAT
    public static void reverseString(String str) {
        int left = 0;
        int right = str.length() - 1;
        StringBuilder string = new StringBuilder(str);
        while (left < right) {
            char temp = string.charAt(left);
            string.setCharAt(left, string.charAt(right));
            string.setCharAt(right, temp);
            left++;
            right--;
        }
        System.out.println(string);
    }

//    option 2 : print string right to left and append the values in stringbulder

    public static void reverseStringOption2(String aa){
        StringBuilder sb = new StringBuilder();

        for(int i = aa.length() - 1; i >= 0; i--){
            sb.append(aa.charAt(i));
        }

        System.out.println(sb);
    }

    public static void main(String[] args) {
        String a = "harshal";
        reverseString(a);
        reverseStringOption2(a);
    }
}