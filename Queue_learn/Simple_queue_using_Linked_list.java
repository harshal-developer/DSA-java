package Queue_learn;

class Node{
    int value;
    Node next;
    Node(int value){
        this.value = value;
        this.next = null;
    }
}

class SimpleQueue{
    Node front = null, rear = null;

    void enqueue(int value){
        Node newNode = new Node(value);
        if(rear == null){
            front = newNode;
            rear = newNode;
            return;
        }
        rear.next = newNode;
        rear = newNode;
    }

    int dequeue(){
        if(rear == null){
            System.out.println("Queue is empty");
            return -1;
        }
        int value = front.value;
        front = front.next;
        if(front == null){
            rear = null;
        }
        return value;
    }

    int peek(){
        if(rear == null){
            System.out.println("queue is empty");
            return -1;
        }

        return front.value;
    }

    boolean isEmpty(){
        return front == null;
    }
    void display(){
        Node current = front;

        while (current != null){
            System.out.print(current.value + " -> ");
            current = current.next;
        }
        System.out.println(" ");
    }
}
public class Simple_queue_using_Linked_list {
    public static void main(String[] args){
        SimpleQueue q = new SimpleQueue();
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
