package Bit_manupilation;

public class clear_bit {
    public static void main(String[] args){
        int n = 5;
        int pos = 2;

        int bitmask = 1<<pos;
//        Perform AND with NOT
        int notbitmask = ~(bitmask);
        int performand = notbitmask & n;
        System.out.print(performand);

//        update_bit bc = new update_bit();
//        bc.harshal();
    }
}
