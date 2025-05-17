
public class InOrder {
    static class NODE{
        int data;
        NODE left, right;
        NODE(int value){
            data = value;
            left = null;
            right = null;
        }
    }
    static void printInOrder(NODE root){
        if (root == null) {
            return;
        }

        printInOrder(root.left);
        System.out.print(root.data + " ");
        printInOrder(root.right);
    }
    public static void main(String[] args){
        NODE root = new NODE(1);
        root.left= new NODE(2);
        root.right= new NODE(3);
        root.left.left= new NODE(4);
        root.left.right= new NODE(5);

        printInOrder(root);
    }
}
