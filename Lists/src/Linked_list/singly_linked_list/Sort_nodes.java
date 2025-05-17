package Linked_list.singly_linked_list;

public class Sort_nodes {
    Node head;
    class Node{
        int value;
        Node next;

        Node(int value){
            this.value = value;
            this.next = null;
        }
    }

    private void sortedList(){
        if(head == null){
            System.out.println("list is mepty");
            return;
        }

        Node current = head;
        while (current.next != null){
            if(current.value > current.next.value){
                int temp = current.next.value;
                current.next.value = current.value;
                current.value = temp;
            }
            current = current.next;
        }
    }

    private void addFrist(int value){
        Node newNode = new Node(value);

        if(head == null){
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    private void printList(){
        if(head == null){
            System.out.println("list is empty");
        }

        Node current = head;
        while(current != null){
            System.out.print(current.value + " -> ");
            current = current.next;
        }
    }

    public static void main(String[] args){
        Sort_nodes list = new Sort_nodes();
        list.addFrist(2);
        list.addFrist(45);
        list.addFrist(6);
        list.addFrist(9);
        list.sortedList();
        list.printList();
    }
}
