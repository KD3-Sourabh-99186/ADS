package Q9;

import java.util.Scanner;

public class Pragram {
	public static void main(String[] args) {
	   Scanner sc = new Scanner(System.in);
       System.out.println("Enter two num1 and num2 respectively");
       int num1=sc.nextInt();
       int num2=sc.nextInt();
       int i = Integer.min(num1, num2);
       System.out.println("GCD of num1 and num2 is  : "+GCD(num1,num2,i));
	}

	private static int GCD(int num1, int num2, int i) {
		if(i==1) {
			return 1;
		}
		if(num1%i==0 && num2%i==0) {
			return i;
		}
		return GCD(num1,num2,i-1);
	}
}
