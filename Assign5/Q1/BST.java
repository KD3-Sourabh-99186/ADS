public class BST {
    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
        }
    }

    private Node root;

    public void insert(int data) {
        root = insert(root, data);
    }

    private Node insert(Node root, int data) {
        if (root == null)
            return new Node(data);

        if (data < root.data)
            root.left = insert(root.left, data);
        else if (data > root.data)
            root.right = insert(root.right, data);

        return root;
    }

    public int getLevel(int key) {
        Node current = root;
        int level = 0;

        while (current != null) {
            if (current.data == key)
                return level;

            if (key < current.data)
                current = current.left;
            else
                current = current.right;

            level++;
        }

        return -1;
    }
}