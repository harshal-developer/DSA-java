package Stacks;

import java.util.Optional;

//I cannot add public to this class, if i add then give error like we should create a file called stackArray.java
class stackArray{
    private int[] arr;
    private int index, cap;
    stackArray(int cap){
        this.cap = cap;
        index = -1;
        arr = new int[cap];
    }

    public void push(int value){
        if(isFull()){
            System.out.println("Stack is full");
            return;
        }
        arr[++index] = value;
    }
    public int peek(){
        if(isEmpty()){
            System.out.println("Stack is empty");
            return -1;
        }
        return arr[index];
    }

    public int pop(){
        if(isEmpty()){
            System.out.println("Stack is Empty");
            return -1;
        }
        return arr[index--];
    }

    public void printStack(){
        for(int i = index; i >= 0; i--){
            System.out.println(arr[i]);
        }
    }


    public boolean isFull(){
        return index == cap - 1;
    }
    public boolean isEmpty(){
        return index == -1;
    }
}

public class Implement_using_array {
//    Option 1 : Directly in Main class
//    static int[] arr = new int[5];
//    static int size = arr.length;
//    static int index = -1;
//
//    static void push(int value){
//        if(isFull()){
//            System.out.println("Stack is full");
//            return;
//        }
//        arr[++index] = value;
//    }
//
//    static void getStack(){
//        for(int i = index; i >= 0; i--){
//            System.out.println(arr[i]);
//        }
//    }
//    static int pop(){
//        if(isEmpty()){
//            System.out.println("stack is empty");
//            return -1;
//        }
////        int top = arr[index];
////        --index;
////        return top;
//        return arr[index--];
//    }
//
////    peek : top element
//    static int peek(){
//        if(isEmpty()){
//            System.out.println("Stack is empty");
//            return -1;
//        }
//        return arr[index];
//    }
//    static boolean isEmpty(){
//        return index == -1;
//    }
//    static boolean isFull(){
//        return index == size - 1;
//    }

//------------------------------------------------------------------------------

    public static void main(String[] args){
//        Calls for option 1
//        Implement_using_array stack = new Implement_using_array();
//        stack.push(45);
//        stack.push(12);
//        stack.push(15);
//        stack.push(0);
//        stack.push(1);
//        System.out.println("Top removed : " + stack.pop());
//        stack.getStack();

//        class for option 2
        stackArray stack = new stackArray(5);
//        stack.push(10);
//        stack.push(20);
//        stack.push(30);
//        stack.push(40);
//        stack.push(50);
//        stack.push(60);

        stack.pop();
        stack.peek();
        stack.printStack();
        System.out.println(stack.isEmpty());
        System.out.println(stack.isFull());;

    }
}
