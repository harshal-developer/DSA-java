package Linked_list.singly_linked_list;

public class Search_in_list {
    Node head;
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    private void addLast(int value){
        Node newNode = new Node(value);
        if(head == null){
            head = newNode;
            return;
        }

        Node current = head;
        while(current.next != null){
            current = current.next;
        }

        current.next = newNode;
    }

    private void printList(){
        if(head == null){
            System.out.println("list is empty");
            return;
        }

        Node current = head;
        while(current != null){
            System.out.println(current.data + " -> ");
            current = current.next;
        }
    }

    private boolean searchInLIst(int value){

        boolean search = false;
        if(head == null){
            System.out.println("list is empty");
            return false;
        }

        Node current = head;
        while (current != null){
            if(value == current.data){
                return true;
            }
            current = current.next;
        }
        return false;
    }

    private void reverseList(){
        Node current = head;
        Node previous = null;

        while(current != null){
            Node next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }
        head = previous;
    }
    public static void main(String[] args){
        Search_in_list list = new Search_in_list();
        list.addLast(10);
        list.addLast(20);
        list.addLast(30);
        list.reverseList();
        list.printList();
//        System.out.println(list.searchInLIst(40));;
    }
}
