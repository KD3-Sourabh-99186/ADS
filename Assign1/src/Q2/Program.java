package Q2;

import java.util.Scanner;

public class Program {
	public static int linearSearch(int[] arr, int key) {
		for(int i=arr.length-1 ; i>=0; i--) {
			if(arr[i]==key)
				return i;
		}
		return -1;
	}
    public static void main(String[] args) {
    	int[] arr = {2,5,1,7,3,47,22,19,2,3,4,2,5,3,1,6,7};
    	
    	Scanner sc = new Scanner(System.in);
    	System.out.print("Enter key to be searched : ");
  		int key = sc.nextInt();
  		
        System.out.println("lenght of arr : "+arr.length);
  		for(int i : arr) {
  			System.out.print(i+" ");
  		}
  		System.out.println();
  		
  		int result = linearSearch(arr ,key);
  		
  		if(result!=-1)
  			System.out.println("Last occurence of "+key+" is : "+result);
  		else
  			System.out.println("Key not found");
    }
}
