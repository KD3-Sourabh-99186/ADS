package Q5;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	System.out.print("Enter n : ");
    	int n = sc.nextInt();
    	int result = nthFibbonacci(n);
    	System.out.println(n + " fibbonacci number is : "+result);
    }

	private static int nthFibbonacci(int n) {
		if(n==1 || n==2) {
			return 1;
		}
		
		return nthFibbonacci(n-1)+nthFibbonacci(n-2);
	}
}
