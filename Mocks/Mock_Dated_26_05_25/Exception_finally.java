package Mock_Dated_26_05_25;

public class Exception_finally {
    public static void main(String[] args) {
        try {
            // int x = 5 / 0; //suppressed
            System.out.println("bb");
        } finally  {
            int y = 5 / 8; // handled
            System.out.println("aa");
        }
    }
}
