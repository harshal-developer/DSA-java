import java.util.Arrays;

public class inbuiltSort {
    public static void main(String[] args) {
//        String[] arr = {"harshal","aa", "ok"};
        int[] arr = {4,3,3,2,3,3,4};
        Arrays.sort(arr);

        for (int i = 0; i < arr.length ; i++) {
            System.out.println(arr[i]);
        }
    }
}
