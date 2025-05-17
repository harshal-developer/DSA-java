package Stacks;

public class Implement_using_Linked_List {
    Node head;
    class Node{
        int value;
        Node next;
        Node(int value){
            this.value = value;
            this.next = null;
        }
    }
//    push : insert at the begining
    public void push(int val){
        Node newNode = new Node(val);
        if(head == null){
            head = newNode;
            newNode.next = null;
            return;
        }
        newNode.next = head;
        head = newNode;
    }
    public void pop(){
        if(head == null){
            System.out.println("Stack is empty");
            return;
        }
        Node temp = head;
        head = head.next;
        temp = null; //strict removal of old head
    }
    public int peek(){
        if(head == null){
            System.out.println("Stack is empty");
            return -1;
        }
        return head.value;
    }
    public boolean isEmpty(){
        return head == null;
    }

    public void printstack(){
        Node current = head;
        while (current != null){
            System.out.println(current.value);
            current = current.next;
        }
    }

    public static void main(String[] args){
        Implement_using_Linked_List stack = new Implement_using_Linked_List();
//        stack.push(12);
//        stack.push(15);
//        stack.push(89);
//        stack.push(0);
//        stack.push(1);
        stack.pop();
        System.out.println(stack.isEmpty());;
        System.out.println("peek :" + stack.peek());;
        stack.printstack();
    }
}
