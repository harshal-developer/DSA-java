public class quick_Main {
    public static void main(String[] args){
        int[] arr = {5, 4, 1, 3, 2};
        quickSort(arr, 0, arr.length - 1);
        for(int num : arr){
            System.out.println(num + " ");
        }
    }
    private static void quickSort(int[] arr, int low, int high){
        if(low < high){
            int privotIndex = partition(arr, low, high);
//            left :
            quickSort(arr, low, privotIndex - 1);
//            right
            quickSort(arr, privotIndex + 1, high);
        }
    }

    private static int partition(int[] arr, int low, int high){
        int privotElement = arr[high]; //assume
        int i = low - 1;

        for(int j = low; j < high; j++){
            if(arr[j] < privotElement){
                i++;
    //            swap
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
//        pivot at correct position
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;
        return i + 1;
    }
}
