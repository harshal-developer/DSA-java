package Stacks;

public class min_Stack_Problem {
//    Frist I tried my self then some imporovements by gpt
    static int[] stack1 = new int[5];
    static int[] stack2 = new int[5];
    static int index1 = -1;
    static int index2 = -1;

    static void push(int value){
        if(isStack1Full()){
            System.out.println("Stack 1 is full");
            return;
        }
        stack1[++index1] = value;
        if (isStack2Empty() || value <= stack2[index2]) {
            stack2[++index2] = value;
        }
    }

    static int getMin(){
        if(isStack2Empty()){
            System.out.println("Min Stack is empty");
            return -1;
        }
        return stack2[index2];
    }

    static void stack1Pop(){
        if(isStack1Empty()){
            System.out.println("Main Stack is empty");
            return;
        }
        index1--;
    }
    static void stack2Pop(){
        index2--;
    }

    static int stack1Peek(){
        if(isStack1Empty()){
            System.out.println("Main Stack is empty");
            return  -1;
        }
        return stack1[index1];
    }

    static int pop(){
        if(isStack2Empty()){
            System.out.println("Main Stack is empty");
            return -1;
        }
        int top = stack1Peek();
        if (top == stack2Peek()) {
            stack2Pop();
        }
        stack1Pop();
        return top;
    }

    static int stack2Peek(){
        if(isStack2Empty()){
            System.out.println("Mini stack is empty");
            return -1;
        }
        return stack2[index2];
    }

    static void printStack2(){
        System.out.println("Min Stack:");
        for(int i = index2; i >= 0; i--){
            System.out.println(stack2[i]);
        }
    }

    static boolean isStack1Full(){
        return index1 == stack1.length -1;
    }
    static boolean isStack1Empty() {
        return index1 == -1;
    }
    static boolean isStack2Empty(){
        return index2 == -1;
    }

    public static void main(String[] args){
        min_Stack_Problem stack = new min_Stack_Problem();
        push(1);
        push(20);
        push(2);
        push(2);
        push(0);

        System.out.println("Popped: " + pop()); // Pops 0
        System.out.println("Current Min: " + getMin()); // Should be 1

        printStack2();  // See current state of min stack
    }
}
