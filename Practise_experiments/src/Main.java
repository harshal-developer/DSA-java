public class Main {
    public static void main(String[] args) {
        // System.out.println("Hello, World!");

        int[] arr = {1,2,3,4,5,6,7};
        int target = 2;
        int index = performBinarySearch(arr, target);
        System.out.println(index);
    }

    public static int performBinarySearch(int[] arr, int target){
        int left = 0; 
        int right = arr.length - 1;
        while(left <= right){
            int mid = left + (right - left) / 2;
            if(target == arr[mid]){
                return mid;
            }else if(arr[mid] > target){
                right = mid - 1;
            }else{
                left = mid + 1;
            }
        }
        return -1;
    }
}