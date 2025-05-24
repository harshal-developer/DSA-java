package Stacks.Problems;

public class two_Stacks_in_one_array{
    int[] twoStackArray;
    int size, stack1Top, stack2Top;
    public two_Stacks_in_one_array(int size){
        this.size = size;
        twoStackArray = new int[size];
        stack1Top = size / 2 + 1;
        stack2Top = size / 2;
    }

    void push1(int data){
        if(stack1Top == size - 1){
            System.out.println("Stack 1 overflow ");
            return;
        }
        twoStackArray[stack1Top++] = data;
    }
    void push2(int data){
        if(stack2Top > size / 2){
            System.out.println("Stack 2 overflow ");
            return;
        }
        twoStackArray[stack2Top++] = data;
    }   

    int pop1(){
        if(stack1Top <= size / 2){
            System.out.println("Stack 1 underflow");
            return -1;
        }
        return twoStackArray[--stack1Top];
    }

    int pop2(){
        if(stack2Top < 0){
            System.out.println("Stack 2 underflow");
            return -1;
        }
        return twoStackArray[--stack2Top];
    }


    public static void main(String[] args){
        two_Stacks_in_one_array ts = new two_Stacks_in_one_array(5);
        ts.push1(2);
        ts.push1(3);
        ts.push2(4);
        System.out.print(ts.pop1() + " ");
        System.out.print(ts.pop2() + " ");
        System.out.print(ts.pop2() + " ");

    }
}