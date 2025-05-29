package LinkedHashMap;

import java.util.HashMap;
import java.util.Map;

public class LRU_Cache_HashMap_DLL_implementation {
    class Node {
        int key;
        int value;
        Node next;
        Node prev;

        Node(int k, int v) {
            key = k;
            value = v;
        }
    }

    private final int capacity;
    private final Map<Integer, Node> map; // store key and node linked to it
    private final Node head;
    private final Node tail;

    // LRUCache block
    public LRU_Cache_HashMap_DLL_implementation(int cap) {
        capacity = cap;
        map = new HashMap<>();
        head = new Node(0, 0); // dummy head
        tail = new Node(0, 0); // dummy tail
        head.next = tail;
        tail.prev = head;
    }

    public int get(int key) {
        if (!map.containsKey(key)) {
            return -1;
        }
        Node node = map.get(key);
        remove(node);
        insertAtFront(node);
        return node.value;
    }

    public void put(int key, int value) {
        if (map.containsKey(key)) {
            remove(map.get(key));// remove the node
        }

        if (map.size() >= capacity) {
            Node r1 = tail.prev;
            remove(r1);
            map.remove(r1.key);
        }

        Node newNode = new Node(key, value);
        insertAtFront(newNode);
        map.put(key, newNode);
    }

    public void remove(Node node) {
        node.prev.next = node.next;
        node.next.prev = node.prev;
    }

    public void insertAtFront(Node node) {
        node.next = head.next;
        node.prev = head;
        node.next.prev = node;
        head.next = node;
    }

    public static void main(String[] args) {
        LRU_Cache_HashMap_DLL_implementation cache = new LRU_Cache_HashMap_DLL_implementation(2);
        cache.put(1, 10);
        cache.put(2, 20);
        System.out.println(cache.get(1)); // 10

        cache.put(3, 30); // 2 will be removed (least used)
        System.out.println(cache.get(2)); // -1 (not found)
        System.out.println(cache.get(3)); // 30

    }
}
