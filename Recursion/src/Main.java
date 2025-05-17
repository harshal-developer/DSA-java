import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
     System.out.println("Enter the number you want :");
     Scanner sc = new Scanner(System.in);
     int no = sc.nextInt();
     int i = 1;
     gettable(i, no);
     System.out.println("done");
    }
    static int gettable(int i, int no){
//        int increment = ++i;
//        base condition
        if(i > 10){
            return 1;
        }
        System.out.println(no * i);
        return gettable(i = i+1,no);
    }
}