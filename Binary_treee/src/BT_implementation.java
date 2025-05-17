

class Node{
    int data;
    Node left, right;

    Node(int value){
        data = value;
        left = null;
        right = null;
    }
}
public class BT_implementation {

    public static void main(String[] args) {
        Node node = new Node(5);
        node.left = new Node(6);
        node.right = new Node(8);
        node.left.left = new Node(10);
        node.left.right = new Node(12);
        node.right.left = new Node(45);

        System.out.println("Tree created succssfully");
    }
}