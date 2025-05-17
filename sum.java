import java.util.Scanner;

public class sum {
    public  static void main(String[] args){
        Scanner sc = new Scanner(System.in);
//        System.out.print("please enter the number");
//        int a = sc.nextInt();
//        int temp = 0;
//        for(int i = 1; i <= a; i++){
//            temp = temp+i;
//        }
//        int i = 1;
//        while(i <= a){
//            temp = temp+ i;
//            i++;
//        }
//        do{
//            temp = temp+i;
//            i++;
//        }while(i <= 3);
//        System.out.println(temp);
//        table
        int k = 1;
        while(k <= 10){
            System.out.print("please enter the number");
            int a = sc.nextInt();
            int i = 1;
            int temp = 0;
            while(i <= 10){
                temp = i*a;
                System.out.println(temp);
                i++;
            }
            k++;
        }

        System.out.println("End");
        sc.close();
    }
}
