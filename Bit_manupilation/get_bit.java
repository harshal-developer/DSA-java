package Bit_manupilation;

public class get_bit {
    public static void main(String[] args){
        int n = 8;
        int pos = 3;
        int bitmask = 1<<pos;
//        Perform AND
        if((bitmask & n) ==0){// use can use other bitwise operator here like | etc.
            System.out.print("bit was zero");
        }else{
            System.out.print("bit was one");
        }
    }
}
