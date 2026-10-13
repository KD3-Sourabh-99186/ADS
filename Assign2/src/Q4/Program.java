package Q4;

import java.util.Scanner;

public class Program {
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.println("Enter postfix expression:");
	        String expression = sc.nextLine();

	        System.out.println("Result: " + PostfixEvaluation.evaluate(expression));

	        sc.close();
	    }
}
