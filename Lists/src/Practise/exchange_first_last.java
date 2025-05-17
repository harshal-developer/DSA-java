package Practise;


public class exchange_first_last {
    private static Node head;
    class Node{
        int value;
        Node next;
        Node(int value){
            this.value = value;
            this.next = null;
        }
    }

    void addLast(int value){
        Node newNode = new Node(value);
        if(head == null){
            head = newNode;
            return;
        }
        Node current = head;
        while (current.next != null){
            current = current.next;
        }
        current.next = newNode;
        newNode.next = null;
    }

    void display(){
        if(head == null){
            System.out.println("LIST IS EMPTY");
            return;
        }
        Node current = head;
        while (current != null){
            System.out.print(current.value + " -> ");
            current = current.next;
        }
    }

    void exchangeNow(){
        if(head == null){
            System.out.println("LIST IS EMPTY");
            return;
        }
        Node first = head;
        Node current = head;
        while (current.next != null){
            current = current.next;
        }
    }

    public static void main(String[] args){
        exchange_first_last ll = new exchange_first_last();
        ll.addLast(12);
        ll.addLast(45);
        ll.addLast(89);
        ll.addLast(21);
        ll.addLast(50);

        ll.exchangeNow();
        ll.display();
    }
}
