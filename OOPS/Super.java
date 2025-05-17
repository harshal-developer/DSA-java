package OOPS;

class parentClass{
    int a;
    parentClass(int a){
        this.a = a;
    }
}
class childClass extends parentClass{
    childClass(){
        super(12);
        System.out.println(a);
    }
}
public class Super {
    public static void main(String[] args){
        childClass cc = new childClass();
    }
}
