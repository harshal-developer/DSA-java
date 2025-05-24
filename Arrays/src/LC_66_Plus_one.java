import java.util.Arrays;

public class LC_66_Plus_one {
    static int[] plusOne(int[] arr){
        for(int i = arr.length - 1; i >= 0;  i--){
            if(arr[i] < 9){
                arr[i]++;
                return arr;
            }
            arr[i] = 0;
        }
        
        int[] newArr = new int[arr.length + 1];
        arr[0] = 1;
        return newArr;
    }
    public static void main(String[] args) {
        int[] arr = {9};

        int[] solution = plusOne(arr);
        System.out.println(Arrays.toString(solution));
    }
}
