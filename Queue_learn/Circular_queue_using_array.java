package Queue_learn;

class CircularQueueArray{
    int[] arr;
    int capacity;
    int front, rear, size;
//    size : needed for space resuem

    CircularQueueArray(int capacity){
        this.capacity = capacity;
        arr = new int[capacity];
        front = -1;
        rear = -1;
        size = 0;
    }

    void enqueue(int value){
        if(isFull()){
            System.out.println("Queue is full");
            return;
        }

        if(isEmpty()){
            front = 0;
        }

//        while adding, if for first insertion front updated to 0, cause we store the first element at the 0th(front) position in array
        rear = (rear + 1) % capacity;
        arr[rear] = value;
        size++;
    }

    int dequeue(){
        if(isEmpty()){
            System.out.println("Queue is empty");
            return -1;
        }
        int value = arr[front];
        front = (front + 1) % capacity;
        size--;

        if(size == 0){
            front = -1;
            rear = -1;
        }
        return value;
    }

    int peek(){
        if(isEmpty()){
            System.out.println("Queue is empty");
            return -1;
        }

        return arr[front];
    }

    boolean isEmpty(){
        return size == 0;
    }

    boolean isFull(){
        return size == capacity;
    }

    void display(){
        if(isEmpty()){
            System.out.println("Queue is empty");
            return;
        }

        int i = front;

        for(int counter = 0; counter < size; counter ++){
            System.out.print(arr[i] + " ");
            i = (i + 1) % capacity;
        }
    }
}
public class Circular_queue_using_array {
    public static void main(String[] args){
        CircularQueueArray q  = new CircularQueueArray(5);
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.enqueue(40);
        q.enqueue(50);

        q.display(); // 10 20 30 40 50

        System.out.println("Dequeued: " + q.dequeue()); // 10
        System.out.println("Dequeued: " + q.dequeue()); // 20

        q.enqueue(60);
        q.enqueue(70);

        q.display(); // 30 40 50 60 70 (space reused!)

        System.out.println("Front: " + q.peek()); // 30
    }
}
