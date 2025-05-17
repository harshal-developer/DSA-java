import java.util.Scanner;

public class static_keyword {
    static  int a;
    static {
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
    }

    static void anygeta(){
        System.out.println(a);
    }

    public static void main(String[] args){
        System.out.println(a);
        anygeta();
    }
}
