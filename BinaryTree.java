import java.util.*;
import java.lang.*;

class BinaryTree {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the root node:");
        Node root;
        root = new Node(sc.nextInt());
        // Insertion of elements
        populate(root, sc);
        // Display of elements
        display(root);

    }

    public static void populate(Node root, Scanner sc) {
        System.out.println("Do u want to enter the value left to node " + root.value);
        boolean ans = sc.nextBoolean();

        if (ans) {
            System.out.println("Enter the value left to the node " + root.value);
            int val = sc.nextInt();
            root.left = new Node(val);
            populate(root.left, sc);
        }

        System.out.println("Do u want to enter the value right to node " + root.value);
        boolean ans2 = sc.nextBoolean();
        if (ans2) {
            System.out.println("Enter the value left to the node " + root.value);
            int val = sc.nextInt();
            root.right = new Node(val);
            populate(root.right, sc);
        }

    }

    public static void display(Node root) {
        if (root == null) {
            return;
        }
        System.out.print(root.value + " ");
        display(root.left);
        display(root.right);
    }

    static class Node {
        int value;
        Node left;
        Node right;

        Node(int value) {
            this.value = value;
        }
    }
}