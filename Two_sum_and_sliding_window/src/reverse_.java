import java.util.Arrays;

public class reverse_ {
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,6,7};

        String[] string = {"a","b","c","d","e","f"};
        reverseSTring(string);
//        reverseArr(arr);
    }

    public static void reverseSTring(String[] arr){
        int left = 0;
        int right = arr.length - 1;

        while (left < right){
            String temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left ++;
            right --;
        }
        for(int i = 0 ; i < arr.length; i++){
            System.out.print(arr[i] + ", ");
        }
    }






//    public static void reverseArr(int[] arr){
//        int left = 0;
//        int right = arr.length - 1;
//        while (left < right){
//            int temp = arr[left];
//            arr[left] = arr[right];
//            arr[right] = temp;
//            left++;
//            right--;
//        }
//        System.out.println(Arrays.toString(arr));
//    }
}
