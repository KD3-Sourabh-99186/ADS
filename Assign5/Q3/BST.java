package Q3;

public class BST {
	static class Node{
		private int data;
		private Node left;
		private Node right;
		
		public Node(int value) {
			data = value;
			left = right = null;
		}
	}
	
	private Node root;
	
	public BST() {
		root = null;
	}
	
	public boolean isEmpty() {
		return root == null;
	}
	
	public void addNode(int value) {
		//1. create a newnode with given value
		Node newnode = new Node(value);
		//2. if BST is empty, add newnode into root itself
		if(root == null)
			root = newnode;
		//3. if BST is not empty
		else {
			//3.1 create trav and start at root node
			Node trav = root;
			while(true) {
				//3.2 if value is less than current node
				if(value < trav.data) {
					//3.2.1 if left of current node is empty
					if(trav.left == null) {
						// add newnode into left of current node
						trav.left = newnode;
						break;
					}
					//3.2.2 if left is not empty
					else
						// go one left of current node
						trav = trav.left;
				}
				//3.3 if value is greater or equal than current node
				else {
					//3.3.1 if right of current node is empty
					if(trav.right == null) { 
						// add newnode into right of current node
						trav.right = newnode;
						break;
					}
					//3.3.2 if right of current node is not empty
					else
						// go one right of current node
						trav = trav.right;
				}
			}//3.4 repeate above two steps untill node is added into BST
		}
	}
	
	public void findSuccessor(int key) {
		if(root == null) {
			System.out.println("BST is empty");
		}
		Node trav = root;
		while(trav != null) {
			if(trav.data == key) {
				break;
			}
			else if(key<trav.data) {
				trav = trav.left;
			}
			else {
				trav = trav.right;
			}
		}
		if(trav == null) {
			System.out.println("Successor dont exist");
			return;
		}
		Node parent = trav;
		Node suc = trav.right;
		while(suc != null) {
			parent = suc;
			suc = suc.left;
		}
		if(parent==trav) {
			System.out.println("Successor dont exist");
		}
		else {
			System.out.println("Successor of "+key+" is : "+parent.data);
		}
	}
	
}














