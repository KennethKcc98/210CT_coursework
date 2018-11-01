import java.util.*;
class TestBinary {
    public static void main(String [] args) {
        int data = 0;
        BinarySearch tree = new BinarySearch();
        for (int k = 0; k < 10; k++) {
            data = (int)(k);
            System.out.print(data + " ");
            tree.insert(data);
        }
        /*
        tree.root = new BinaryNode(1);
        tree.root.left = new BinaryNode(4);
        tree.root.right = new BinaryNode(5);

        tree.root.left.left = new BinaryNode(7);
        tree.root.left.left.left = new BinaryNode(2);
        tree.root.left.left.right = new BinaryNode(9);

        
        tree.root.right.right = new BinaryNode(6);
        tree.root.right.right.left = new BinaryNode(3);

        tree.root.right.right.right= new BinaryNode(8);
        tree.root.right.right.right.left = new BinaryNode(0);
        */

        System.out.println();
        System.out.println("This is print in ascending order: ");
        tree.inorder();
        
    }
}