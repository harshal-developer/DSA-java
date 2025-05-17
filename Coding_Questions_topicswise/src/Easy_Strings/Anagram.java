package Easy_Strings;

public class Anagram {
    public static void main(String[] args) {
        String a = "Harshal";
        String b = new String("Harshal");
        System.out.println(a == b); //false
        String c = "Harshal";
        System.out.println(a == c); //true
    }
}
