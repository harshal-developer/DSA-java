package Stacks;

class MyStack {
//    fixed stack
   int maxSize = 5;
   int[] arr = new int[maxSize];
   int top = -1; //initially stack is empty

    void push(int value){
        if(top == maxSize -1){
//            before adding any value, check whether stack is full or not
            System.out.println("stack overflow");
            return;
        }
        arr[++top] = value;
    }

    int pop(){
        if(top == -1){
//            before removing the value, check whether the stack is empty or not
            System.out.println("stack overflow");
            return -1;
        }

        return arr[top--];
    }

    int peek(){
        if(top == -1){
//            before peek the value, check whether stack is empty or not
            System.out.println("stack overflow");
            return -1;
        }
        return arr[top];
    }

    boolean isEmpty(){
        return top == -1;
    }
}
class array_stack{
    public static void main(String[] args){
        MyStack stack = new MyStack();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);

        System.out.println(stack.peek());
        System.out.println(stack.pop());
        System.out.println(stack.peek());
        System.out.println(stack.isEmpty());
    }
}