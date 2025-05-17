package Linked_list.doubly_linked_list;

public class end_of_the_list {
    Node head;
    Node tail;

    private class Node{
        int value;
        Node next = null;
        Node prev = null;
        Node(int value){
            this.value = value;
        }
    }

    public void AddLast(int value){
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
        newNode.prev = current;
        current.next = newNode;
    }
    public void getAll(){
        Node current = head;
        while (current != null){
            System.out.print(current.value + " -> ");
            current = current.next;
        }
    }
    public static void main(String[] args){
        end_of_the_list ll = new end_of_the_list();
        ll.AddLast(45);;
        ll.AddLast(5);;
        ll.AddLast(89);;
        ll.AddLast(25);;
        ll.getAll();

    }
}
