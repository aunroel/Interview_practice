package graphs;

public class BST {

    private class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            left = null;
            right = null;
        }
    }

    public Node root;

    BST() {
        root = null;
    }

    BST(int item) {
        root = new Node(item);
    }

    public void add(int item) {
        root = add(root, item);
    }

    private Node add(Node curr_node,int item) {
        if (curr_node == null) {
            curr_node = new Node(item);
            return curr_node;
        }


        if (curr_node.data > item)
            curr_node.left = add(curr_node.left, item);
         else
            curr_node.right = add(curr_node.right, item);

        return curr_node;
    }

    public void inOrder(Node n) {
        if (n != null) {
            inOrder(n.left);
            if (n == root)
                System.out.println("r:" + n.data);
            else
                System.out.println(n.data);
            inOrder(n.right);
        }
    }

    public Node createMinBST(int[] array) {
        return createMinBST(array, 0, array.length - 1);
    }

    private Node createMinBST(int[] array, int start, int end) {
        if (end < start)
            return null;

        int mid = (start + end) / 2;
        Node n = new Node(array[mid]);
        n.left = createMinBST(array, start, mid - 1);
        n.right = createMinBST(array, mid + 1, end);
        return n;
    }

}
