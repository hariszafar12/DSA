package DSA;

import java.util.Stack;

public class InfixToPostfix {

    // Method to return precedence of operators
    public static int precedence(char operator) {
        switch (operator) {
            case '+':
            case '-':
                return 1; // Lowest precedence
            case '*':
            case '/':
                return 2; // Higher precedence
        }
        return -1; // For non-operator characters
    }

    // Method to convert an infix expression to postfix expression
    public static String infixToPostfix(String expression) {
        StringBuilder result = new StringBuilder();
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < expression.length(); i++) {
            char c = expression.charAt(i);

            // If the character is an operand (A-Z), add it to the result
            if (Character.isLetterOrDigit(c)) {
                result.append(c);
            }
            // If the character is '(', push it to the stack
            else if (c == '(') {
                stack.push(c);
            }
            // If the character is ')', pop and add to result until '(' is found
            else if (c == ')') {
                while (!stack.isEmpty() && stack.peek() != '(') {
                    result.append(stack.pop());
                }
                stack.pop(); // Pop '(' from the stack
            }
            // If an operator is encountered
            else {
                // Pop from stack while top of the stack has greater precedence
                while (!stack.isEmpty() && precedence(c) <= precedence(stack.peek())) {
                    result.append(stack.pop());
                }
                stack.push(c); // Push the current operator onto the stack
            }
        }

        // Pop all the operators from the stack
        while (!stack.isEmpty()) {
            result.append(stack.pop());
        }

        return result.toString();
    }

    public static void main(String[] args) {
        String expression = "A+B*C+D"; // Input infix expression
        System.out.println("Infix Expression: " + expression);
        String postfix = infixToPostfix(expression);
        System.out.println("Postfix Expression: " + postfix);
    }
}
