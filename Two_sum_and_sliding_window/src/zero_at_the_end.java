import java.util.Arrays;

public class zero_at_the_end {
    public static void main(String[] args) {
        int[] arr = {1,0,0,4,5,6,7};
        int i = 0;
        for(int j = 0; j < arr.length; j++){
            if(arr[j] != 0){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
