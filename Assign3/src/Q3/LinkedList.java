package Q3;

public class LinkedList {
    static class Node{
    	int data;
    	Node next;
    	Node(int data){
    		this.data=data;
    		next=null;
    	}
    }
    
    private Node head , tail;
    
    public LinkedList(){
    	head=null;
    	tail=null;
    }
    
    public void addPos(int data , int pos) {
    	Node newnode = new Node(data);
    	if(head == null) {
    		head = newnode;
            tail = newnode;
            head.next=head;
    	}
    	else if(pos<=1) {
    		newnode.next=head;
    		head = newnode;
    		tail.next = head;
    	}
    	else {
    		Node trav = head;
    		for(int i=1; i<pos-1 && trav.next!=head ; i++) {
    			trav = trav.next;
    		}
    		if(trav.next == head) {
    			newnode.next = head;
    			trav.next = newnode;
    			tail = newnode;
    		}
    		else {
    		    newnode.next = trav.next;
    		    trav.next = newnode;
    		}
    	}
    }
    
    public void deletePos(int data , int pos) {
    	Node trav = head;
    	for(int i=1; i<pos-1 ; i++) {
    		trav = trav.next;
    	}
    	
    }
    
    public void display() {
    	
    	if(head==null) {
    		return;
    	}
    	
    	Node trav = head;
    	System.out.print("List : ");
    	do {
    	    System.out.print(trav.data + " ");
    	    trav = trav.next;
    	}while(trav!=head);
    	 System.out.println();
    }
}





























