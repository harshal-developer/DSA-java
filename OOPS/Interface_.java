package OOPS;
//Declared methods in interface are by default public abstract method
interface interface_A{
//     public abstract void method_1();
/*    can do this : int a
    but do this */
    int a = 34;
    void method_1();
    void method_2();
}

class any_class implements interface_A{
    public void method_1(){
        System.out.println("method_1");
    }
    public void method_2(){
        System.out.println("method_2");
    }
}
public class Interface_ {
    public static void main(String[] args){
        interface_A obj = new any_class();
//        any_class obj = new any_class();
        obj.method_1();
        obj.method_2();
    }
}
