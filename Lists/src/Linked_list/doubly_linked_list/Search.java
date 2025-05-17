package Linked_list.doubly_linked_list;

public class Search {
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

    public void addFirst(int value){
        Node newNode = new Node(value);
        if(head == null){
            head = newNode;
            return;
        }
        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }

    public void getAll(){
        Node current = head;
        while (current != null){
            System.out.println(current.value + " -> ");
            current = current.next;
        }
    }

    public void searchInList(int value){
        if(head == null){
            System.out.println("list is empty");
            return;
        }

        Node current = head;
        int counter = 1;
        boolean found = false;
        while (current != null){
            if(current.value == value){
                System.out.println(current.value + " found at position : " + counter);
                found = true;
                break;
            }
            current = current.next;
            counter ++ ;
        }
        if(!found){
            System.out.println(value + " not found in the list");
        }
    }

    public static void main(String[] args){
        Search ll = new Search();
        ll.addFirst(34);
        ll.addFirst(23);
        ll.addFirst(58);
        ll.addFirst(4);
        ll.getAll();
        ll.searchInList(8);
//        ll.getAll();
    }
}
