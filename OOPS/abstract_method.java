package OOPS;

abstract class  Tree{

    int a;
    public abstract void abs_method(int a);

    public void this_tree(){
        System.out.println("MANGO");
    }
    public void tree_1(){
        System.out.println("Tree tree_1");
    }
}
class Mango extends Tree {
    public void this_tree(){
        System.out.println("MANGO in Mango");
    }
    public void abs_method(int a){
        System.out.println("Abstract method" + a);
    }
}

//class Banana extends Mango{
//    public void abs_method(){
//        System.out.println("Abstract method");
//    }
//}
public class abstract_method {
    public static void main(String[] a){
        Tree mn = new Mango();//it calls of this class
        mn.this_tree();
        mn.abs_method(2);
    }
}
