//* for same function name
class Method_overloading{
    public boolean check(int a){
        if(a > 2){
            boolean checked = true;
            return checked;
        }else{
            System.out.println("not greater then 2");
            boolean checked = false;
            return checked;
        }
    }

//    public int check(int a){} : this also not works
    /* it only depends on the number of types of parameters are passing */

//    below works : fucntion name also same and parameter count is also same but paramter thpe is tring
    public boolean check(String a){
        return  true;
    }
}

//for diff function name
class dff_func_name{
    public dff_func_name(){
        System.out.println("ffff");///as you make the object for a class..the first method called constructor
    }
    public void func_1(int a){
        func_2(a);
    }
    public void func_2(int a){
        System.out.print(a+a);
    }
}



public class func_overloading {

    public  void this_func(){
        System.out.println("hello");
    }
    public static void main(String[] args){
        Method_overloading mc = new Method_overloading();
//        System.out.println(mc.check(2));
        dff_func_name df = new dff_func_name();
//        df.func_2(2);


    }
}
