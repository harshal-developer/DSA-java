import java.util.ArrayList;
import java.util.Collections;

public class Arralist {
    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<Integer>();
//        Add elememnts
        list.add(5);
        list.add(7);
        list.add(2);
        list.add(5);
        list.add(8);
//        System.out.print(list);

//        get elements
        int element = list.get(0);
//        System.out.print(element);

//        add element in between
        list.add(2,18);
//        System.out.print(list);

//        set element
        list.set(1,89);
//        System.out.print(list);

//        delete element
        list.remove(2);
        System.out.println(list);

//        size
        int size = list.size();
        System.out.println(size);

//        loops
        for(int i = 0; i < list.size(); i++){
            System.out.print(list.get(i) + "  ");
        }
        System.out.println();

//        sorting
        Collections.sort(list);
        System.out.print(list);
    }
}
