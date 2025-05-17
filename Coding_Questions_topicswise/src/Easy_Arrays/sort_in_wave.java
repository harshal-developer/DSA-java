package Easy_Arrays;

import java.util.Arrays;

public class sort_in_wave {
    static void sort(int[] arr, int i, int i1) {
        int temp = arr[i];
        arr[i] = arr[i1];
        arr[i1] = temp;
    }
    static void sortInWave(int[] arr){
//        sort first
        Arrays.toString(arr);

        for(int i = 0; i < arr.length - 1; i+=2){
            sort(arr, i , i+1); // arr.lenth -1 beacuase of i + 1;
        }
    }
    public static void main(String[] args){
        int[] nums = {12,34,56,43,1,2,34};
        sortInWave(nums);
        for(int num : nums){
            System.out.print(num + " ");
        }
    }
}
