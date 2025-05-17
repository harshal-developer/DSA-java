package Linked_list.circular_linked_list;

public class Traverse {
    Node head;
    Node tail;
    class Node{
        int value;
        Node next;

        Node(int value){
            this.value = value;
        }
    }

    public void addFirst(int value){
        Node newNode = new Node(value);
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

//    public void addLast(int value){
//        Node newNode = new Node(value);
//
//        if(head == null){
//            head = newNode;
//            tail = newNode;
//            tail.next = head;
//            return;
//        }
//
//        tail.next = newNode;
//        newNode.next = head;
//        tail = newNode;
//    }

    public void deleteFirst(){
        if(head == null){
            System.out.println("list is empty");
            return;
        }
        if(head == tail){
            head = null;
            tail = null;
// if a list contains only one node;
        }else{
            head = head.next;
            tail.next = head;
        }
    }
//
//
    public void deleteLast(){
        if(head == null){
            System.out.println("list is empty");
            return;
        }

        if(head == tail){
            head = null;
            tail = null;
        }else{
            Node current = head;
            while (current.next != tail){
                current = current.next;
            }
            current.next = head;
            tail = current;
        }
    }

//    public void insertAtPosition(int position, int value){
//        if(head == null){
//            addFirst(value);
//            return;
//        }
//
//        Node current = head;
//        int counter = 1;
//        Node newNode = new Node(value);
//        while (current != tail){
//            if(counter == position - 1){
//                newNode.next = current.next;
//                current.next = newNode;
//                return;
//            }
//            current = current.next;
//            counter++;
//        }
//
////        if insert at last position
//        if(counter == position - 1){
//            newNode.next = head;
//            tail.next = newNode;
//            tail = newNode;
//        }
//    }

    public void deleteAtPosition(int position){
        if(head == null){
            System.out.println("list is empty");
            return;
        }
        if (position == 1){
            deleteFirst();
            return;
        }

        Node current = head;
        int counter = 1;

        while (current != tail){
            if(counter == position - 1){
                if (current.next == tail) { // Agar last node delete karni hai
                    current.next = head;
                    tail = current;
                } else {
                    current.next = current.next.next;
                }
                return;
            }
            current = current.next;
            counter++;
        }
    }

    public void displayList(){
        if(head == null){
            System.out.println("list is empty");
            return;
        }
        Node current = head;
        do {
            System.out.print(current.value + " -> ");
            current = current.next;
        }while (current != head);

        System.out.println("END");
    }

    public void reverseList(){
        if(head == null){
            System.out.println("list is empty");
            return;
        }
        if(head == tail){
            System.out.println(head + " already reversed");
            return;
        }

        Node current = head;
        Node prev = tail;

        do {
            Node next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }while (current != head);

//        swap head and tail
        Node temp = head;
        head = tail;
        tail = temp;
    }


    public static void main(String[] args){
        Traverse ll = new Traverse();
        ll.addFirst(45);
        ll.addFirst(5);
        ll.addFirst(12);
//        ll.deleteAtPosition(3);
//        ll.deleteFirst();
//        ll.deleteLast();
        ll.reverseList();
        ll.displayList();
    }
}
