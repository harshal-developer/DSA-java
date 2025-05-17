public class smallestMissingInteger {

    static void findSmallestMissingInteger(int[] arr){

        int sum = 0;
        for(int i = 0; i < arr.length - 1; i++){
            if(arr[i] == arr[i + 1] + 1){
                sum = sum + arr[i];
            }
        }
//        if(sum > 0){
//            System.out.println(sum);
//        }else{
//            System.out.println(sum + " present in an array");
//        }
    }

    public static void main(String[] args) {
        int[] nums = {3,4,5,1,12,14,13};
        findSmallestMissingInteger(nums);
    }
}
