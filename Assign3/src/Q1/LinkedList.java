package Q1;

public class LinkedList {
       static class Node{
    	   int data;
    	   Node next;
    	   
    	   Node(int data){
    		   this.data=data;
    		   next=null;
    	   }
       }
       
       private Node head;
       
       public LinkedList(){
    	   head = null;
       }
       
       public void addFirst(int data) {
    	   Node newnode = new Node(data);
    	   newnode.next = head;
    	   head = newnode;
       }
       
       public void addLast(int data) {
    	  Node newnode = new Node(data);
    	  Node trav = head;
    	  if(trav == null) {
    		  head = newnode;
    	  }
    	  else {
    	      while(trav.next != null) {
    		     trav = trav.next;
    	      }
    	      trav.next = newnode;
    	  }
       }
       
       public void addPosition(int data , int pos) {
    	   Node trav = head;
    	   Node newnode = new Node(data);
    	   if(head == null) {
    		   head = newnode;
    	   }
    	   
    	   for(int i=1 ; i<pos-1 && trav.next!=null ; i++) {
    		   trav = trav.next;
    	   }
    	   newnode.next = trav.next;
    	   trav.next = newnode;
       }
       
       public void deleteFirst() {
    	   if(head != null) {
    		   head = head.next;
    	   }
       }
       
       public void insertbefore(int data , int value) {
    	   Node newnode = new Node(data);
    	   Node trav = head;
    	   while(trav.next!=null) {
    		   trav = trav.next;
               if(trav.next.data == value) {
            	   break;
               }
    	   }
       }
       
       public void deleteLast() {
    	   Node trav = head;
    	   if(trav == null) {
    		   
    	   }
    	   else if(trav.next == null) {
    		   head =null;
    	   }
    	   else {
    		   while(trav.next.next != null) {
    			   trav = trav.next;
    		   }
    		   trav.next = null;
    	   }
       }
       
       public void deletePos(int pos) {
    	   
       }
       
       public void display() {
    	   Node trav = head;
    	   System.out.print("List : ");
    	   while(trav != null) {
    		   System.out.print(trav.data + " ");
    		   trav = trav.next;
    	   }
    	   System.out.println();
       }
       
       public void deleteAll() {
    	   head = null;
       }
       
}

















