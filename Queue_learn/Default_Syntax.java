package Queue_learn;

import java.util.LinkedList;
import java.util.Queue;

public class Default_Syntax {
    public static void main(String[] args){
        Queue<Integer> queue = new LinkedList<>();
        queue.add(12);
        queue.add(10);
        queue.add(48);
        queue.add(63);
        System.out.println(queue);

        System.out.println(queue.remove());
        System.out.println(queue.peek());
        System.out.println(queue.isEmpty());
        System.out.println(queue.size());
    }
}
