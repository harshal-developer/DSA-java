package OOPS;

abstract class Parent3{
    abstract void harshal();
    void func(){
        System.out.println("func in abstract class");
    }
}
class Parent4 extends Parent3{
    public void harshal(){
        System.out.println("in harshal");
    }
    public void anything(){
        System.out.println("in child");
    }
}
public class abstraction {
    public static void main(String[] args) {
        Parent4 dd = new Parent4();
        dd.func();
    }
}
