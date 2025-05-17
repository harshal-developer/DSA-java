import java.util.ArrayList;

class checkItems {
    String name;

    @Override
    public String toString() {
        return "name : " + name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

public class Arraylist_get_i {
    static ArrayList<String> list = new ArrayList<>();
    public Arraylist_get_i(){
        list = new ArrayList<>();
    }

    public static void theFunction(String name){
        for(int i = 0 ; i < list.size(); i++){
            System.out.println(list.get(i));
        }
    }

    public static void main(String[] args) {

        list.add("I");
        list.add("am");
        list.add("harshal");

//        System.out.println(list.toString());
//        System.out.println(list.get(2));
        theFunction(list.get(2));
    }
}
