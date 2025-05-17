package Practise_10_May;

import jdk.dynalink.linker.LinkerServices;

import java.util.Scanner;

public class LL_insert_at_the_head {
    Node head;
    static class Node{
        int value;
        Node next;
        Node(int value){
            this.value = value;
            this.next = null;
        }
    }
    private static Node insertAtHead(Node head, int value){
        Node newNode = new Node(value);
        newNode.next = head;
        head = newNode;
        return head;
    }

    private static void printList(Node head){
        while (head != null){
            System.out.print(head.value + " -> ");
            head = head.next;
        }
        System.out.println("");
    }

    public static void main(String[] args){
        System.out.println("Enter number of nodes you want to insert :  ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Node head = null;
        for(int i = 0; i < n; i++){
            int data = sc.nextInt();
            head = insertAtHead(head ,data);
        }

        printList(head);
    }
}
