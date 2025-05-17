import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedList_Arraylist {
    public static void main(String[] args){
        LinkedList<Integer> llist = new LinkedList<>();
        ArrayList<String> alist = new ArrayList<>();
        llist.add(1);
        llist.add(323);
        llist.add(23);
        llist.add(45);
        System.out.println(llist);
        alist.add("A");
        alist.add("B");
        alist.add("c");
        alist.add("D");
        System.out.println(alist);
    }
}
