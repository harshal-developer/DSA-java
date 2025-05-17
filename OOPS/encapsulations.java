package OOPS;
/*it is a way to keeping data (variables) private and access data via public methods (using getters and setters)
-- ensure security
*/

import com.sun.source.tree.WhileLoopTree;

import java.util.Scanner;

class hiding{
    private double balance;

    public void setBalance(double balance) {
        this.balance = balance;
    }
    public double getBalance() {
        return balance;
    }

    public void deposit(double amount){
        if(amount > 0){
            balance+=amount;
        }
    }
}


public class encapsulations {
    public static void main(String[] a){
        hiding hd = new hiding();
        while(true){
            System.out.println("enter the amount");
            Scanner sc = new Scanner(System.in);
            double amount = sc.nextDouble();
            sc.nextLine();
            hd.deposit(amount);
            System.out.println(hd.getBalance());
        }
    }
}
