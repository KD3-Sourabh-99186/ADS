package Q4;

import java.util.Scanner;
import java.util.Stack;

public class PostfixEvaluation {
    public static int evaluate(String expression) {
        Stack<Integer> stack = new Stack<>();
        String[] tokens = expression.trim().split("\\s+");

        for (String token : tokens) {
            if (token.matches("-?\\d+")) {
                stack.push(Integer.parseInt(token));
            } else {
                int b = stack.pop();
                int a = stack.pop();

                switch (token) {
                    case "+" -> stack.push(a + b);
                    case "-" -> stack.push(a - b);
                    case "*" -> stack.push(a * b);
                    case "/" -> stack.push(a / b);
                    case "%" -> stack.push(a % b);
                }
            }
        }

        return stack.pop();
    }
}
