import java.util.Scanner;

public class fibo {
    public static void main(String[] args) {
        System.out.println("Enter the number you want the series : ");
        Scanner sc = new Scanner(System.in);
        int no = sc.nextInt();
//        int i = 1;
//        int first = 0;
//        int sum = 0;
//        int second = 1;
//        while (i <= no){
//            System.out.println(first);
//           sum = first + second;
//           first = second;
//           second = sum;
//           i++;
//        }
//        System.out.println(first);

        System.out.println(getNthFibo(no));
    }

    static int getNthFibo(int n){
        if(n < 2){
            return n;
        }
        return getNthFibo(n - 1) + getNthFibo(n - 2);
    }
}
