import java.util.Arrays;

public class three_largest {
    public static void main(String[] args) {
        int[] arr = {10,5,8,13,18};

        int[] largestArr = leaders(arr);
        System.out.println(Arrays.toString(largestArr));;

//        array size must be greater or equal to 3
//        for size 2 it does not work
    }

    public static int[] leaders(int[] arr) {
        // code here
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        int thirdLargest = Integer.MIN_VALUE;

        // Find largest, second largest, and third largest
        for (int i = 0; i < arr.length; i++) {
            int current = arr[i];
            if (current > largest) {
                thirdLargest = secondLargest;
                secondLargest = largest;
                largest = current;
            } else if (current > secondLargest && current != largest) {
                thirdLargest = secondLargest;
                secondLargest = current;
            } else if (current > thirdLargest && current != secondLargest && current != largest) {
                thirdLargest = current;
            }
        }

        // Check if there are less than 3 distinct numbers
        if (thirdLargest == Integer.MIN_VALUE) {
            thirdLargest = -1; // Can set to any value representing "no third largest"
        }
        if (secondLargest == Integer.MIN_VALUE) {
            secondLargest = -1; // Can set to any value representing "no second largest"
        }

        return new int[]{largest, secondLargest, thirdLargest};
    }
}
