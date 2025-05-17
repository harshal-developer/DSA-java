public class intro2 {
//    public static void main(String[] args) {
//        intro2 obj = new intro2();
//        obj.main(args); // Call non-static main() method using the object
//    }
//
//    public void main(String[] args) {
//        int a = 3;
//        System.out.print(a);
//    }

    /* Why we need static
        In Java, the main method is the first method that the Java runtime looks for when you run a program. The Java Virtual Machine (JVM) needs to call the main method without creating an instance of the class. If main is not static, you would need to create an instance of the class first to call the method, but the JVM doesn’t create an instance for you—it just calls main.
     */
    public static void main(String[] args) {
        System.out.println(args[1]);
    }
}
