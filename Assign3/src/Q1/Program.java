package Q1;

public class Program {
    public static void main(String[] args) {
    	LinkedList list = new LinkedList();
    	
    	list.addFirst(10);
    	list.addFirst(20);
    	list.addFirst(30);
    	list.addFirst(40);
    	
    	list.addLast(50);
    	list.addLast(60);
    	list.addLast(70);
    	list.addLast(80);
    	
    	list.display();
    	
    	list.deleteFirst();
    	list.deleteFirst();
    	list.deleteLast();
    	list.deleteLast();
    	
    	list.display();
    	
    	list.addPosition(25, 2);
    	list.addPosition(35, 4);
    	list.addPosition(45, 11);
    	
    	list.display();
    	
    }
}

