package Q3;

public class Queue {
   public int[] arr;
   public int size;
   public int front , rear;
   int count;
   
   public Queue(int size) {
	   this.size = size;
	   front = rear = -1;
	   arr = new int[size];
	   count = 0;
   }
   
   public void offer(int value) {
	   if(isFull()) {
		   System.out.println("Queue is full");
	   }
	   else {
		   arr[(rear+1)%size]=value;
		   count++;
		   rear = (rear+1)%size;
	   }
   }
   
   public int poll() {
	   if(isEmpty()) {
		   System.out.println("Queue is empty");
		   return -1;
	   }
	   else {
		   count--;
		   int res = arr[(front+1)%size];
		   front = (front+1)%size;
		   return res;
	   }
   }
   
   public int peek() {
	   if(isFull()) {
		   System.out.println("stack is full");
		   return -1;
	   }
	   else {
		   return arr[(front+1)%size];
	   }
   }
   
   public boolean isFull() {
	   if(count == size) {
		   return true;
	   }
	   else {
		   return false;
	   }
   }
   public boolean isEmpty() {
	   if(count == 0) {
		   return true;
	   }
	   else {
		   return false;
	   }
   }
}
