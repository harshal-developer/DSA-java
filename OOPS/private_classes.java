package OOPS;

class Outer{
    private class Inner{
        void printSomething(){
            System.out.println("i am in private");
        }
    }

    public void accessInner() {
        Inner in = new Inner();
        in.printSomething();
    }
}
public class private_classes {
    public static void main(String[] args){
        Outer ff = new Outer();
        ff.accessInner();
    }
}
