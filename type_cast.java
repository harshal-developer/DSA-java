public class type_cast {
    public static void main(String[] args){
//        int n = 100;
//        String str = String.valueOf(n);
        char ch = 'c';
        String cch = String.valueOf(ch);

        if (cch.equals("c")) {  // Correct comparison
            System.out.println("Good job");
        } else {
            System.out.println("Wrong answer");
        }
    }
}
