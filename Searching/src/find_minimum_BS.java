import java.util.Scanner;

public class find_minimum_BS {
    public static int performSearch(int[] arr){
        int low = 0;
        int high = arr.length - 1;
        while (low < high){ // at last iteration low == high and loops breaks,, but when we do low <= high and it still go to loop even when we already found the smallest element
            int mid = low + (high - low) / 2;
            if(arr[mid] > arr[high]){ //beacuase in roated array : smallest element always in an unsorted part for eg : 4,5,6,7,8,1,2...unsorted part starts form 1 so smallest element is 1
//                go right
                low = mid + 1;
            }else{
//                go left
                high = mid;
            }
        }

        return arr[low];
    }
    public static void main(String[] args){
        System.out.println("Enter an array : ");
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[7];
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        int min = performSearch(arr);
        System.out.println("Smallest element is " + min);
    }
}
