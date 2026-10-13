import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BST bst = new BST();

        System.out.println("Enter number of nodes:");
        int n = sc.nextInt();

        System.out.println("Enter node values:");
        for (int i = 0; i < n; i++)
            bst.insert(sc.nextInt());

        System.out.println("Preorder traversal:");
        bst.preorder();

        System.out.println("Inorder traversal:");
        bst.inorder();

        System.out.println("Postorder traversal:");
        bst.postorder();

        sc.close();
    }
}