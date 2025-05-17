package Exerciess;

public class sorting_asc {
    public static void main(String[] args){
//        sort an array in asc order
        int [] arr = {2,5,15,1,2};
        int temp = 0;
        for (int i = 0; i < arr.length - 1; i++) {  // Ensure we don't go out of bounds
            for (int j = i + 1; j < arr.length; j++) { // Start comparison with the next elements
                if (arr[i] > arr[j]) {
                    // Swap arr[i] and arr[j] if they are in the wrong order
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println("Sorted array in ascending order:");
        for (int j : arr) {
            System.out.print(j + " ");
        }
    }
}
