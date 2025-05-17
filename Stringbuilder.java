public class Stringbuilder {
    public static void main(String[] args) {
        StringBuilder sc = new StringBuilder("Harshal");
//        System.out.print(sc.charAt(2));

//        set character at index
//        sc.setCharAt(0, 'M');
//        System.out.println(sc);
//
//        sc.delete(2,3);
//        System.out.println(sc);
//
//        sc.append("ff");
//        System.out.print(sc);

//        Reverse the string
        for(int i = 0; i < sc.length()/ 2; i++){
            int front = i;
            int back = sc.length() -  1 - i;

            char firstChart = sc.charAt(front);
            char lastchat = sc.charAt(back);

            sc.setCharAt(front, lastchat);
            sc.setCharAt(back,firstChart);
        }
        System.out.println(sc);
    }

}



