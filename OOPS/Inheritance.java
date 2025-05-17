package OOPS;

import static OOPS.interface_A.a;

interface A{
    int a = 0;
    abstract void get();
    default int sdfsf(int a){
        return a;
    }
}

class C implements A {
    public void get(){
        System.out.println("sdfsdf");
    }
    public void show(){
        System.out.println("ia m in show");
    }
}
public class Inheritance {
    public static void main(String[] args) {
        C b = new C();
        b.show();
    }
}
