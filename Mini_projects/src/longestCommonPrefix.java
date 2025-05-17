import java.util.Arrays;

public class longestCommonPrefix {
    static void findLongestCommonPrefix(String[] arr){
        if(arr.length == 0 || arr == null){
            System.out.println("please enter some array elements ......");
        }
        Arrays.sort(arr);

        String first = arr[0];
        String last = arr[arr.length - 1];

        int minlength = Math.min(first.length(), last.length());

        int i = 0 ;
        while (i < minlength && first.charAt(i) == last.charAt(i)){
            i++;
        }

        String commonprefit = first.substring(0, i);
        System.out.println(commonprefit);
    }
    public static void main(String[] args) {
        String[] arr = {"fly", "aflood", "flower", "flies"};
        findLongestCommonPrefix(arr);
    }
}
