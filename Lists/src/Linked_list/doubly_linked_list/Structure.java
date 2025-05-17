package Linked_list.doubly_linked_list;

public class Structure {
    Node head;
    Node tail;

    class Node{
        int value;
        Node next;
        Node prev;
        Node(int value){
            this.value = value;
            this.next = null;
            this.prev = null;
        }
    }

    public void insertAtBegining(int value){
        Node node = new Node(value);
        if(head == null){
            head = node;
            tail = node ;
        }else{
            node.next = head;
            head.prev = node;
            head = node;
        }
    }

    public void forwardTraversal(){
        Node current = head;
        while(current != null){
            System.out.print(current.value + " -> ");
            current = current.next;
        }
        System.out.println("END");
    }

    public void backwordTraversal(){
        Node current = tail;
        while (current != null){
            System.out.print(current.value + " -> ");
            current = current.prev;
        }
        System.out.println("END");
    }


    public static void main(String[] args){
        Structure list = new Structure();
        list.insertAtBegining(4);
        list.insertAtBegining(6);
        list.insertAtBegining(89);
        list.insertAtBegining(7);
        list.forwardTraversal();
        list.backwordTraversal();



    }
}
