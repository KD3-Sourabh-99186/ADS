package Q2;

public class Stack {
    public int[] arr;
    public int size;
    public int top;
    
    public Stack(int size) {
    	this.size = size;
    	top = size;
    	arr = new int[size];
    }
    
    public void push(int value) {
    	if(isFull()) {
    		System.out.println("stack is full ");
    	}
    	else {
    		arr[--top]=value;
    	}
    }
    
    public int pop() {
    	if(isEmpty()) {
    		System.out.println("stack is empty");
    		return -1;
    	}
    	else {
    		return arr[top++];
    	}
    }
    
    public int peek() {
    	if(isEmpty()) {
    		System.out.println("stack is empty");
    		return -1;
    	}
    	else {
    		return arr[top];
    	}
    }
    
    public boolean isEmpty() {
    	if(top==size) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    
    public boolean isFull() {
    	if(top==0) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
}
