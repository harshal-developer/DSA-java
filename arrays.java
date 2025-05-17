import java.util.Scanner;

public class arrays {

    public static void main(String[] args) {
//        String [] harshal = new String[]{"ff", "ff", "dd", "asdf", "sdfsdf"};
//
//        for(String elements : harshal){
//            System.out.print(" " + elements);
//        }
//        int arr[] = {1,3,34,32,4,4,3,4,34,54,4};
//
//        int i = 0;
//        while (i < arr.length){
//            System.out.print(arr[i]);
//            System.out.print(" ");
//            i++;
//        }
//        for(int i = 0; i< arr.length; i++){
//            System.out.println(arr[i]);
//        }


//Custom size :
//        System.out.print("Please enter the size of an array  :");
//        Scanner sc = new Scanner(System.in);
//        int size = sc.nextInt();
//        int[] custom_arr = new int[size];
//
//        System.out.println("Enter your array elements : ");
//        take input
//        for (int i = 0; i < size; i++) {
//            custom_arr[i] = sc.nextInt();
//        }
//        System.out.println("Your array is :");
//        for (int elements : custom_arr) {
//            System.out.println(elements);
//        }

//        Find a number and print its index :
        System.out.print("Enter any array");
        int [] any_arr = new int[5];

        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < any_arr.length; i++){
            any_arr[i] = sc.nextInt();
        }
        System.out.print("Enter any to you want to search : ");

        int no = sc.nextInt();
        boolean present = false;
        for(int i = 0; i < any_arr.length; i++){
           if(any_arr[i] == no){
               System.out.println(no + "is present on "+ i);
               present = true;
           }
        }
        if(!present){
            System.out.print("not present in array");
        }
    }
}
