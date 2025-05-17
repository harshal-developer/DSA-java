package Linked_list.singly_linked_list;

class Nodes {
    Node head;
    class Node{
        String data;
        Node next;
        //    set the data of node while making of it
        Node(String data){
            this.data = data;
            this.next = null;
        }
    }

    public void addFrist(String data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;
    }

    public void addLast(String data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }

        Node currentNode = head;
        while(currentNode.next != null){
            currentNode = currentNode.next;
        }
        currentNode.next = newNode;// added at last
    }
//    C++ : NULL
//    java : null
    public void printList(){
        if(head == null){
            System.out.println("list is empty");
            return;
        }
        Node currentNode = head;
//        currentNode.next != null : not prints last node so we use currentNode != null
//        currentNode == tail : tail.next is null then .it stops the while loop execution
        while(currentNode != null){
            System.out.print(currentNode.data + " -> ");
            currentNode = currentNode.next;
        }
        System.out.println("end");
    }

    public void deleteFirst(){
        if(head == null){
            System.out.println("list is empty");
            return;
        }
        head = head.next;
    }

    public void deleteLast(){
        if(head == null){
            System.out.println("list is empty");
            return;
        }
        if(head.next == null){
            head = null;
            return;
        }
        Node secondLastNode = head;
        Node lastNode = head.next;

        while (lastNode.next != null){
            secondLastNode = lastNode.next;
            lastNode = secondLastNode.next;
        }

        secondLastNode.next = null; //deleted last lastNode
    }

    public static void main(String[] args) {
        Nodes list = new Nodes();
        list.addLast("harshal");
        list.addFrist("the");
        list.addFrist("I am");
//        list.deleteFirst();
        list.printList();
    }
}
