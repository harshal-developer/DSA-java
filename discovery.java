import java.util.Arrays;

class discovery{
    public static void main(String[] args) {
//        find second largest element in an array

        int[] arr = {3,2,3,454,43};
        for(int i = 0 ; i < arr.length; i++){
            for(int j = 0; j < arr.length - i - 1; j++){
                if(arr[j] > arr[j + 1]){
                    int temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println(arr[arr.length - 2]);
    }
}