package Q4;

import java.util.Arrays;
import java.util.Scanner;

public class Program {
   public static int binarySearch(Integer[] arr, int key) {
	   int left = 0;
	   int right = arr.length-1;
	   int mid;
	   
	   while(left<=right) {
		   mid = (left+right)/2;
		   if(key==arr[mid]) {
			   return mid;
		   }
		   else if(key<arr[mid]) {
			   left = mid+1;
		   }
		   else {
			   right = mid-1;
		   }
	   }
	   
	   return -1;
   }
   public static void main(String[] args) {
	   Integer[] arr = {2,5,1,7,3,47,22,19,2,3,4,2,5,3,1,6,7};
   	
   	   Scanner sc = new Scanner(System.in);
   	   System.out.print("Enter key to be searched : ");
 	   int key = sc.nextInt();
 	   
 	   System.out.println("lenght of arr : "+arr.length);
 	   Arrays.sort(arr,(x,y)->Integer.compare(y, x));
	    for(int i : arr) {
			System.out.print(i+" ");
		}
		System.out.println();
		
		int result = binarySearch(arr ,key);
		
		if(result!=-1)
			System.out.println(key+" found at index : "+result);
		else
			System.out.println("Key not found");
   }
}
