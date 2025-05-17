package Bit_manupilation;

import java.util.Scanner;

public class update_bit {
    public static void main(String[] args){
        int any_number = 5;
        int pos = 1;

        System.out.println("Enter to go with 0 or 1 : ");
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();

        int bitmask = 1<<pos;
        if(choice == 0){
//            perform clear operation : AND with NOT
            int afternot = ~(bitmask);
            int afterand = afternot & any_number;
            System.out.print(afterand);
        }else if(choice == 1){
//            perform set operation : OR
            int afteror = bitmask | any_number;
            System.out.print(afteror);
        }else{
            System.out.print("Invoice choice");
        }
    }

//    Just for package understaning
    public void harshal(){
        System.out.print("fuck off");
    }
}
