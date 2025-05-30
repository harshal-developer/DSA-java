package Practise_29_May_Hashing;

import java.util.HashMap;
import java.util.Map;

public class LRUCache_implementation {
    // for DLL 
    class Node{
        int key;
        int value;
        Node next;
        Node prev;
        Node(int k, int v){
            key = k;
            value = v;
        }
    }

    private final int capacity; 
    private final Map<Integer, Node> map;
    private final Node head;
    private final Node tail;

    LRUCache_implementation(int capacity){
        this.capacity = capacity;
        map = new HashMap<>();
        head = new Node(0, 0);
        tail = new Node(0, 0);
        head.next = tail;
        tail.prev = head;
    }

    // get put remove moveNodetofront 

    public int get(int key){
        if(!map.containsKey(key)){
            return -1;
        }

        Node node = map.get(key);
        remove(node);
        moveNodeToFront(node);
        return node.value;
    }

    public void put(int key, int value){
        if(map.containsKey(key)){
            remove(map.get(key));
        }

        if(map.size() >= capacity){
            Node r1 = tail.prev;
            remove(r1);
            map.remove(r1.key);
        }

        Node newNode = new Node(key, value);
        moveNodeToFront(newNode);
        map.put(key, newNode);
    }

    public void remove(Node node){
        node.prev.next = node.next;
        node.next.prev = node.prev;
    }

    public void moveNodeToFront(Node node){
        node.next = head.next;
        node.prev = head;
        node.next.prev = node;
        head.next = node;
    }
    

    public static void main(String... args){
        LRUCache_implementation cache = new LRUCache_implementation(2);
        cache.put(1, 10);
        cache.put(2, 20);
        System.out.println(cache.get(1)); // 10

        cache.put(3, 30); // 2 will be removed (least used)
        System.out.println(cache.get(2)); // -1 (not found)
        System.out.println(cache.get(3)); // 30
    }
}
