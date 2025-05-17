import java.util.Scanner;

public class static_blocks {
    static int a;
    static int ab;
//    you cannot declare scanner outside the functiono main / static
    static {
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
    }

    public void setAb(int ab) {
        this.ab = ab;
    }
    public int getAb() {
        return ab;
    }

    public static void main(String[] args){
//        int a = 3; //then 3
        System.out.println("valid : " + a);
//        System.out.println("valid : " + ba);
        static_blocks ab = new static_blocks();
        ab.setAb(564);
        System.out.println(ab.getAb());
    }
}
