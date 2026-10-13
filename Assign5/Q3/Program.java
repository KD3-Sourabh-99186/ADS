package Q3;

public class Program {
   public static void main(String[] args) {
	   BST bst = new BST();
		
		bst.addNode(8);
		bst.addNode(3);
		bst.addNode(10);
		bst.addNode(2);
		bst.addNode(15);
		bst.addNode(6);
		bst.addNode(14);
		bst.addNode(4);
		bst.addNode(7);
		
		bst.findSuccessor(8);
		bst.findSuccessor(7);
		bst.findSuccessor(3);
		bst.findSuccessor(14);
   }
}
