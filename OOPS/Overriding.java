package OOPS;

class Parent1{
    void show(){
        System.out.println("first");
    }
}
class Parent2 extends Parent1{
    void show(){
        System.out.println("second");
    }
}
public class Overriding {
    public static void main(String[] args) {
        Parent1 a  = new Parent2();
        a.show();
    }
}
