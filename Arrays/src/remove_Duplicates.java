import java.util.Arrays;

public class remove_Duplicates {
    public static void main(String[] args) {
        int[] arr = {2,3,4,3,3,2,3,4,7};
//        print unique elements here
        int[] uniq = removeDuplicate(arr);
        System.out.println(Arrays.toString(uniq));
    }
    private static int[] removeDuplicate(int[] arr){
        int[] tempArr = new int[arr.length];
        int uniqueCount = 0;

        for (int i = 0; i < arr.length; i++) {
            boolean isDuplicate = false;
            // Check if the element is already in the tempArr
            for (int j = 0; j < uniqueCount; j++) {
                if (arr[i] == tempArr[j]) {
                    isDuplicate = true;
                    break;
                }
            }

            // If it's not a duplicate, add it to the tempArr
            if (!isDuplicate) {
                tempArr[uniqueCount] = arr[i];
                uniqueCount++;
            }
        }
        // Copy the unique elements into a new array of the correct size
        int[] uniqueArr = Arrays.copyOf(tempArr, uniqueCount);

        return uniqueArr;
    }
}
