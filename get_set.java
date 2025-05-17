class gettter_and_setters{

//    this keyword refers to the object used to called setA method : oin this case the object is -> gs
    private int a = 5; //instance variable

    public void setA(int a ) { //pass object as varibale : gettter_and_setters gs
        //gs.a = a; //local variable
        this.a = a;
    }

    public int getA() {
        return a;
    }
}
public class get_set{
    public static void main(String[] args) {
        gettter_and_setters gs = new gettter_and_setters();
        gs.setA(30);
        System.out.println(gs.getA());
    }
}
