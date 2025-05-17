package Linked_list.singly_linked_list;

public class delete_k_in_sequence {
    Node head;
    class Node{
        int value;
        Node next;
        Node(int value){
            this.value = value;
            this.next = null;
        }
    }

    private void removeKthNode(int k){
        if (head == null || k <= 0) {
            System.out.println("List is empty or k is invalid");
            return;
        }

        // Special case: remove head (k == 1)
        if (k == 1) {
            head = null;
            return;
        }

        Node current = head;
        int count = 1;

        while (current.next != null) {
            if ((count + 1) % k == 0) {
                // Delete the k-th node
                current.next = current.next.next;
            } else {
                current = current.next;
            }
            count++;
        }
    }

    private void printAll(){
        Node current = head;
        while (current != null){
            System.out.println(current.value + " -> ");
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
    public static void main(String[] args) {
        delete_k_in_sequence list = new delete_k_in_sequence();
        list.addFrist(10);
        list.addFrist(9);
        list.addFrist(4);
        list.addFrist(2);
        list.removeKthNode(2); // remvoe every kth element
        list.printAll();
    }
}
