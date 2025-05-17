package Linked_list.doubly_linked_list;

public class insert_at_position {
    Node head;
    Node tail;
    class Node {
        int value;
        Node next;
        Node prev;

        Node(int value) {
            this.value = value;
            this.next = null;
            this.prev = null;
        }
    }
    public void addInList(int value){
        Node newNode = new Node(value);
        if(head == null){
            head = newNode;
            return;
        }else{
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
    }
    public void getAll(){
        Node current = head;
        while(current != null){
            System.out.print(current.value + " -> ");
            current = current.next;
        }
        System.out.println("END");
    }
    public void insertAtPosition(int value, int position){
        if(position == 1){
            addInList(value);
        }else{
            Node node = new Node(value);
            int counter = 1;
            Node current = head;
            while (current != null & counter < position - 1){ //this statement gives current = position - 1 th element
                current = current.next;
                counter++;
            }

            node.next = current.next;
            node.prev = current;

            if(current.next != null){
                current.next.prev = node;
            }
            current.next = node;
        }
    }
    public static void main(String[] args){
        insert_at_position list = new insert_at_position();
        list.addInList(45);
        list.addInList(5);
        list.addInList(18);
        System.out.println("Insert At any Position ");
        list.insertAtPosition(34,4);
        list.getAll();
    }
}
