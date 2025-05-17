package Queue_learn.Prioriy_queue;

import java.util.PriorityQueue;

public class Default_structure {
    public static void main(String[] args){
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(45);
        pq.add(10);
        pq.add(30);

//        In java, ProrityQueue follow min priority queue arrangment
        while (!pq.isEmpty()){
            System.out.println(pq.poll());
        }
        
    }
}
