public class fun_calling {
    public static void main(String[] args) {
        message(1);
    }
    static void message(int n){
        System.out.println("Hellow");
        message(n + 1);

    }
}
