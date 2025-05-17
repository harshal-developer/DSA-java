package Linked_list.singly_linked_list;

import java.util.Scanner;

class LinkedLIst{
    Node head;
    public void add(int value){
        Node newNode = new Node(value);
        if(head == null){
            head = newNode;
            head.next = null;
            return;
        }

        newNode.next = head;
        head = newNode;
    }

    public void getlist(){
        if(head == null) throw new IllegalStateException("List is empty");
        Node current = head;
        while (current != null){
            System.out.print(current.value + " -> ");
            current = current.next;
        }
    }

    public void countOccurances(int value){
        Node current = head;
        int counter = 0;
        while (current != null){
            if(current.value == value){
                counter++;
            }
            current = current.next;
        }
        if(counter == 0){
            System.out.println("NOT FOUND!!!!!!!!!");
            return;
        }
        System.out.println(value + " is appeared " + counter + " times");
    }
}
public class count_occurances {
    public static void main(String[] args){
        LinkedLIst ll = new LinkedLIst();
        ll.add(5);
        ll.add(7);
        ll.add(10);
        ll.add(5);
        System.out.println("Enter the value");
        Scanner sc = new Scanner(System.in);
        int val = sc.nextInt();
        System.out.println("Searching....");
        ll.countOccurances(val);
//        ll.getlist();
    }
}
