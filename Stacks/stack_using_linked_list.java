package Stacks;


class Stack{
    Node top;
    class Node{
        int value;
        Node next;
        Node(int value){
            this.value = value;
            this.next = null;
        }
    }

//    there is not need to check stack is full or not before inserting the element becuase we are using LL FOR DYNAMIC INSERTION AND DELETION
    void push(int value){
        Node newNode = new Node(value);
        newNode.next = top;
        top = newNode;
    }

    int pop(){
        if(top == null){
            System.out.println("stack overflow");
            return -1;
        }
        int popped = top.value;
        top = top.next;
        return  popped;
    }

    int peek(){
        if(top == null) throw new IllegalStateException("stack overflow");

        return top.value;
    }

    boolean isEmpty(){
        return top == null;
    }

    void printList(){
        Node current = top;
        while (current != null){
            System.out.print(current.value + " -> ");
            current = current.next;
        }
        System.out.println("END");
    }
}

public class stack_using_linked_list {
    public static void main(String[] args){
        Stack stack = new Stack();
//        stack.push(50);
//        stack.push(10);
//        stack.push(30);
//        stack.push(45);
//        System.out.println(stack.pop());
//        System.out.println(stack.peek());
        System.out.println(stack.isEmpty());
        stack.printList();
    }
}
