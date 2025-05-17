package OOPS;

interface paymentMethod{
    void makePayment(double amount);
}

class creditCard implements paymentMethod{
    public void makePayment(double amount){
        System.out.println(amount + " credit card");
    }
}
class upi implements paymentMethod{
    public void makePayment(double amount){
        System.out.println(amount + " upi");
    }
}
class netBanking implements paymentMethod{
    public void makePayment(double amount){
        System.out.println(amount + " net banking");
    }
}
public class Payment_project_via_polymorphism {
    public static void main(String[] args) {
        paymentMethod p;
        p = new creditCard();
        p.makePayment(4555);
        p = new upi();
        p.makePayment(5665);
        p = new netBanking();
        p.makePayment(5665);
    }
}
