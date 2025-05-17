package Linked_list.doubly_linked_list;

public class deletion {
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

    public void addLast(int value){
        Node newNode = new Node(value);
        if(head == null){
            head = newNode;
            return;
        }
        Node current = head;
        while (current.next != null){
            current = current.next;
        }
        newNode.next = null;
        current.next = newNode;
        newNode.prev = current;
    }

    public void getAll(){
        Node current = head;
        while (current != null){
            System.out.print(current.value + " -> ");
            current = current.next;
        }
    }

    public void deleteFrist(){
        if(head == null){
            System.out.println("list is empty");
            return;
        }
        Node current = head;
        head = current.next;

        if(head != null){
            head.prev = null;
        }
        current.next = null; //for cleanup
    }

    public void deleteAtlast() {
        if(head == null){
            System.out.println("list is empty");
            return;
        }
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
//        option 1 : for doubly
        tail = current.prev;
        if(tail != null){
            tail.next = null;
        }

//        option 2: for singly
//        current.prev.next = null;
//        current.prev = null //cleanup
    }

    public void deleteAtPosition(int position){
        if(head == null){
            System.out.println("list is empty");
            return;
        }
        if(position == 1){
            deleteFrist();
        }else{
            Node current = head;
            int counter = 1;
            while (current != null && counter < position){
                current = current.next;
                counter++;
            }

            if(current == null){
                System.out.println("pointer out of range");
                return;
            }

            if(current.next != null){
                current.prev.next = current.next;
                current.next.prev = current.prev;
            }else{
                current.prev.next = null;
            }

            current.next = null;
            current.prev = null;
        }
    }

    public static void main(String[] args){
        deletion ll = new deletion();
        ll.addLast(3);
        ll.addLast(34);
        ll.addLast(14);
        ll.addLast(94);
//        ll.deleteFrist();
//        ll.deleteAtlast();
        ll.deleteAtPosition(4);
        ll.getAll();
    }
}
