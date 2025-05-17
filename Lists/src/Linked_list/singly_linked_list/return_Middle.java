package Linked_list.singly_linked_list;

class Node{
    int value;
    Node next;
    Node(int getValue){
        this.value = getValue;
        this.next = null;
    }
}

class Linked_list{
    Node head;

    public void addLast(int value){
        Node newNode = new Node(value);
        if(head == null){
            head = newNode;
            head.next = null;
            return;
        }
        Node current = head;
        while (current.next != null){
            current = current.next;
        }

        current.next = newNode;
        newNode.next = null;
    }

    public void getList(){
        Node current = head;
        while (current != null){
            System.out.print(current.value + " ->");
            current = current.next;
        }
        System.out.println("END");
    }

    public void printMiddle(){
        if(head == null) throw new IllegalStateException("list is empty");
        Node slow = head;
        Node fast = head;
//        when fast at 100, slwo at 50
        while (fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        System.out.println(slow.value);
//        int[] arr  = new int[100];
//        int counter = 0;
//        while (current != null){
//            arr[counter++] = current.value;
//            current = current.next;
//        }
//        int[] temp = Arrays.copyOf(arr, counter);
//        System.out.println(Arrays.toString(temp));
//        if (temp.length > 0)
//            System.out.println("Middle Value: " + temp[temp.length / 2]);
//        else
//            System.out.println("The list is empty.");
//        System.out.println(Arrays.toString(arr));

//        ArrayList<Integer> values = new ArrayList<>();
//        while (current.next != null){
//            values.add(current.value);
//            current = current.next;
//        }
//        values.add(current.value);
//        System.out.println(values);
//        int middleValue = values.get(values.size() / 2);
//        System.out.println("Middle Value: " + middleValue);
    }
}

public class return_Middle {
    public static void main(String[] args) {
        Linked_list ll = new Linked_list();
//        ll.addLast(5);
//        ll.addLast(12);
//        ll.addLast(25);
//        ll.addLast(8);
//        ll.addLast(2);
        ll.getList();
        ll.printMiddle();
    }
}
