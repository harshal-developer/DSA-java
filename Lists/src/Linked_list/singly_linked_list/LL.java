package Linked_list.singly_linked_list;

import java.util.LinkedList;

public class LL {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();
        list.addFirst("a");
        list.addFirst("b");
        list.addFirst("c");
        list.addLast("kkk");

//        for(int i = 0; i < list.size(); i++){
//            System.out.print(list.get(i) + " -> ");
//        }
//        System.out.println("\n");
        list.removeFirst();
        list.removeLast();
        System.out.println(list);
    }
}
