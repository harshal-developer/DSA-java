class construcoter{
    int a;
    String sc;

    public construcoter(int a, String sc){
        this.a = a;
        this.sc = sc;
    }
//    we can do this also :
    public construcoter(){
        System.out.println("constucter overloading");
    }

    public void getvars(){
//        if constructoer code is commented then this will be the output : a value is : 0b value is : null
        System.out.println("a value is : " + a + "b value is : " + sc);
    }

}

public class constructoer_intro {
    public static void main(String[] args){
        construcoter cs = new construcoter(4, "ff");
        cs.getvars();
    }
}

