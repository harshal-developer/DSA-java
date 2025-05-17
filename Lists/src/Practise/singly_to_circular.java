package Practise;

class SingleCircular{
    Node head;
    class Node{
        int value;
        Node next;
        Node(int value){
            this.value = value;
            this.next = null;
        }
    }

    void addFirst(int value){
        Node newNode = new Node(value);
        if(head == null){
            head = newNode;
            head.next = null;
            return;
        }

        newNode.next = head;
        head = newNode;
    }

    void addLast(int value){
        Node newNode = new Node(value);
        if(head == null){
            System.out.println("LIST IS EMPTY");
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

        System.out.println(" ");
    }

    void convertToCircular(){
        if(head == null){
            System.out.println("LIST IS EMPTY");
            return;
        }

        if(head.next == null){
            head.next = head;
            return;
        }

        Node current = head;
        while (current.next != null){
            current = current.next;
        }

        current.next = head;
    }
}

class singly_to_circular{

    public static void main(String[] args){
        SingleCircular sl = new SingleCircular();


        sl.addFirst(12);
        sl.addFirst(15);
        sl.addFirst(18);
        sl.addFirst(20);

        sl.display();
        sl.convertToCircular();
    }
}
