package Q8;

public class Program {
   public static void main(String[] args) {
	   Integer[] arr = {2,5,1,7,3,22,19,2,3,4,2,5,3,1,6,7};
	   //Integer[] arr = {1,1,2,2,3,3,4,4};
	   
	   for(int i=0; i<arr.length ; i++) {
		   boolean R = true;
		   for(int j=0 ; j<arr.length ; j++) {
			   if(i==j)
				   continue;
			   if(arr[i]==arr[j]) {
				   R=false;
				   break;
			   }	   
		   }
		   if(R==true) {
			   System.out.println("First non repeating number is : "+arr[i]);
			   System.exit(0);
	       }
	   }
	   
	   System.out.println("No non-repeating element found");
   }
}
