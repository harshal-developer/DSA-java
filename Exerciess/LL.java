package Exerciess;

public class LL {
//    declaration
    Node head;
    class Node{
        int value;
        Node pointer;

        Node(int value){
            this.value = value;
            this.pointer = null;
        }
    }

    public void addFirst(int value){
        Node newNode = new Node(value);
        if(head == null){
            head = newNode;
            return;
        }

        newNode.pointer = head;
        head = newNode;
    }

    public void addLast(int value){
        Node lastValue = new Node(value);
        if(head == null){
            head = lastValue;
            return;
        }
        Node current = head;
        while (current.pointer != null){
            current = current.pointer;
        }

        current.pointer= lastValue;
    }

    public void deleteAtIndex(int position){
        if(head == null){
            System.out.println("list is empty");
            return;
        }

        Node current = head;

//        traverse
//        want to delete node at 2nd position so looping to position - 1
        for(int i = 0; i < position - 1 && current != null; i++){
            current = current.pointer;
        }

        if(current == null && current.pointer == null){
            System.out.println("invalid position");
            return;
        }
        current.pointer = current.pointer.pointer;
    }

    public void deleteFirst(){
        if(head == null){
            System.out.println("list is empty");
            return;
        }
        head = head.pointer;
    }


    public void deleteLast(){
        Node secondLast = head;
        Node lastNode = head.pointer;

        if(head.pointer == null){
            head = null;
            return;
        }

        while (lastNode.pointer != null){
            secondLast = lastNode.pointer;
            lastNode = secondLast.pointer;
        }

        secondLast.pointer = null;
    }

    public void printList(){
        if(head == null){
            System.out.println("list is empty");
            return;
        }

        Node current = head;
        while (current != null){
            System.out.print(current.value + " -> ");
            current = current.pointer;
        }

        System.out.println("\n");
        System.out.println("Execution end");
    }

    public static void main(String[] args){
        LL list = new LL();
        list.addLast(2);
        list.addLast(5);
        list.addLast(8);
        list.addLast(56);

        list.deleteAtIndex(2);

        list.printList();
    }
}
