public class finally_keyword {
    public static void main(String[] args){
        System.out.println(divide(1,0));
    }
    static int divide(int a, int b){
        try{
            return a / b;
        }catch (ArithmeticException e){
            return -1;
        }finally {
            System.out.print("Execute this even if run anyone from above");
        }
    }
}
