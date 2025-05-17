package Queue_learn;

import javax.xml.crypto.dsig.SignatureMethod;

class SimpleQueueArray{
    int[] arr;
    int front, rear;
    int capacity;
    SimpleQueueArray(int size){
        capacity = size;
        arr = new int[capacity];
        front = 0;
        rear = -1;
    }

    void enqueue(int value){
        if(rear == capacity - 1){
            System.out.println("QUEUE IS FULL");
            return;
        }

        rear++;
        arr[rear] = value;
    }

    int dequeue(){
        if(isEmpty()){
            System.out.println("QUEUE IS EMPTY");
            return -1;
        }

        int data = arr[front];
        front++;
        return data;
    }

    int peek(){
        if(isEmpty()){
            System.out.println("QUEUE IS EMPTY");
            return -1;
        }

        return arr[front];
    }

    void display(){
        if(isEmpty()){
            System.out.println("QUEUE IS EMPTY");
            return;
        }
        for(int i = front; i <= rear; i++){
            System.out.print(arr[i] + " ");
        }
    }

    boolean isEmpty(){
        return front > rear;
    }
    boolean isFull(){
        return rear == capacity - 1;
    }
}
public class Simple_queue_using_array {
    public static void main(String[] args){
        SimpleQueueArray q = new SimpleQueueArray(3);
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);

        q.display(); // 10 20 30
        System.out.println("Removed: " + q.dequeue());
        System.out.println("Removed: " + q.dequeue());
        q.enqueue(888);
        q.enqueue(500);
        q.display();

    }
}
