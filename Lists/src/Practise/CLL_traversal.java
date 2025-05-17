package Practise;

class circular_LL{
    Node head;
    Node tail;
    class Node{
        int value;
        Node next;

        Node(int value){
            this.value = value;
            this.next = null;
        }
    }

    void addFirst(int value){
        Node newNode = new Node(value);;
        if(head == null){
            head = newNode;
            tail = newNode;
            head.next = head;
            return;
        }

        newNode.next = head;
        tail.next = newNode;
        head = newNode;
    }

    void addLast(int value){
        Node newNode = new Node(value);
        if(head == null){
            addFirst(value);
            return;
        }
        tail.next = newNode;
        newNode.next = head;
        tail = newNode;
    }

    void display(){
        if(head == null){
            System.out.println("LIST is empty");
            return;
        }

        Node current = head;

        do {
            System.out.print(current.value + " -> ");
            current = current.next;
        }while (current != head); //current != head;
        System.out.println(" ");
    }

    void checkifCircular(){
        if(head == null){
            System.out.println("list is empty");
            return;
        }

        if(tail.next == head){
            System.out.println("Circular linked list");
        }else{
            System.out.println("not circular");
        }
    }

    void deleteFirst(){
        if(head == null){
            System.out.println("LIST IS EMPTY");
            return;
        }

//        what if single node is there
        if(head == tail){
            head = null;
            tail = null;
        }else{
            head = head.next;
            tail.next = head;
        }
    }

    void deleteLast(){
        if(head == null){
            System.out.println("LIST IS EMPTY");
            return;
        }

        if(head == tail){
            head = null;
            tail = null;
            return;
        }

        Node current = head;
        while (current.next != tail){
            current = current.next;
        }

        current.next = head;
        tail = current;
    }
}

public class CLL_traversal {
    public static void main(String[] args){
        circular_LL ll = new circular_LL();
        ll.addFirst(4);
        ll.addFirst(2);
        ll.addFirst(45);
        ll.addFirst(12);

        ll.deleteFirst();
        ll.deleteLast();
        ll.display();
//        ll.checkifCircular();
    }
}
