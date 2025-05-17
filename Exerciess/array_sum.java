package Exerciess;
import java.util.Scanner;

public class array_sum {
    public  static void main(String[] args){

//        sum or array elements
        Scanner sc = new Scanner(System.in);
        System.out.print("Entek the desicred size of an array :");
        int size = sc.nextInt();
        int [] num_arr = new int[size];

//        Scan the elemets
        for(int i = 0; i < num_arr.length; i++){
            num_arr[i] = sc.nextInt();
        }


        int sum = 0;
        for(int elements : num_arr){
            sum = sum + elements;
        }

        System.out.println("sum of array elements are : "+sum);
    }
}