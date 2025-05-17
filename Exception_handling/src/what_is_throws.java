import java.io.FileNotFoundException;
import java.io.FileReader;

public class what_is_throws {
//    shot 1
//    public static void main(String[] args) throws FileNotFoundException {
////        if a.txt not found
////        FileReader fileReader = new FileReader("a.txt");
//        method1();
//    }
//    static void method1() throws FileNotFoundException {
//        FileReader fileReader = new FileReader("a.txt");
//    }


//    Shot 2

    public static void main(String[] args) throws FileNotFoundException  {
//        FileReader fileReader = new FileReader("a.txt");
        method1();
    }
    static void method1() throws FileNotFoundException {
        try {
            FileReader fileReader = new FileReader("a.txt");
        } catch (FileNotFoundException e) {
            System.out.println("FILE NOT FOUND");
//            throw new RuntimeException(e);
            throw new FileNotFoundException("oops"); // forcefully throw exception
        }
    }
}
