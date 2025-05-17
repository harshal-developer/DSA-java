package Bit_manupilation;

public class set_bit {
    public static void main(String[] args){
        int n = 5;
        int pos = 1;

        int bitmask = 1<<pos;
//        Perform OR
        int newnumber = bitmask | n;
        System.out.print(newnumber);
    }
}
