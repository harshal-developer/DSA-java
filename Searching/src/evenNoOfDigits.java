public class evenNoOfDigits {
    public static void main(String[] args) {
        int[] arr = {569,42,111,51,21};

        int check = countEvenNoOfDigits(arr);
        System.out.println(check);
    }

    static int countEvenNoOfDigits(int[] arr) {
        int counter = 0;
        for(int no : arr){
//            if(isEvenDigits(no)){
//                counter ++;
//            }
            int digits = isEvenDigits(no);
            if(no % 2 == 0){
                counter++;
            }
        }
        return counter;


    }

    static int isEvenDigits(int no) {


//        int count = 0;
//
        if(no < 0){
            no = no + -1;
        }
        return (int) (Math.log10(no)) + 1;
//
//        while (no > 0){
//            count ++;
//            no = no / 10;
//        }
//        if(count % 2 == 0){
//            return true;
//        }
//        return false;
    }
}
