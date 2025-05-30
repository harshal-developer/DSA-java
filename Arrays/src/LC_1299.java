import java.util.Arrays;

public class LC_1299{
    public static void main(String[] args) {
        // int[] arr = {17,18,5,4,6,1};
        int[] arr = {1,2,3,4,5};
        System.out.println(Arrays.toString(replaceElements(arr)));
    }

    public static int[] replaceElements(int[] arr) {
        // My code : success with space complexity is O(n)
        // int[] solution = new int[arr.length];
        // if(arr.length == 1){
        //     return new int[]{-1};
        // }

        // int max = arr[arr.length - 1];
        // solution[arr.length - 1] = -1;
        // for(int i = arr.length - 1; i > 0; i--){
        //     if(arr[i] > max){
        //         max = arr[i];
        //     }
        //     solution[i - 1] = max;
        // }
        // return solution;

        // Optimised by gpt with Space complexity is O(1)
        int max = -1;
        for(int i = arr.length - 1; i >= 0; i--){
            int temp = arr[i];
            arr[i] = max;
            if(temp > max) max = temp;
        }
        return arr;
    }
}

