//package Q1;
//
//public class Queue {
//    public int[] arr;
//    public int size;
//    public int front,rear;
//    
//    public Queue(int size) {
//    	this.size=size;
//    	arr = new int[size];
//    	front = rear = 0;
//    	mod = 0;
//    }
//    
//    public void offer(int value) {
//    	mod=1;
//    }
//    
//    public boolean isEmpty() {
//    	if(mod == 0)
//    		return true;
//    	if(rear==front && rear!=0) {
//    		return true;
//    	}
//    	else {
//    		return false;
//    	}
//    }
//    
//    public boolean isfull() {
//    	if(rear == size-1) {
//    		return true;
//    	}
//    	else {
//    		return false;
//    	}
//    }
//    
//}
