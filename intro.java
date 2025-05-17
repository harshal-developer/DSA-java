public class intro {
    private static int main() {
        System.out.println("hellow word");

        harsh cc = new harsh();
        String c = cc.harshal();
        System.out.println(c);
        return 0;
    }

    public static void main(String[] args) {
        intro intro = new intro();
        int harsh = main();
        if (harsh == 0) {
            intro.definethis(harsh);
        }
//        System.out.print(harsh);
    }

    public void definethis(int harsh) {
        char harshchar = (char) harsh;
        System.out.println(harshchar + 'c');
    }
}

class harsh {
    public String harshal() {
        System.out.println("ff");
        return "ff";
    }
}
