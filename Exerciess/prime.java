package Exerciess;

import java.util.Scanner;

public class prime {
    public static void main(String[] args){
        System.out.print("Enter the number you want to check prime or not : ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        boolean isPrime = true;
        if(a > 0){
            for (int i = 2; i * i <= a; i++) {
                if (a % i == 0) {
                    isPrime = false;  // Found a divisor, num is not prime
                    break;
                }
            }
        }else{
            System.out.println("Please enter no greater than 0");
        }
        if(isPrime){
            System.out.println("no is prime");
        }else{
            System.out.println("no is not prime");
        }
    }
}
