package DSA;

import java.util.Scanner;
import java.util.Stack;

public class Lab5Task2 {

    // Method to check if the string has balanced brackets
    public static boolean isBalanced(String str) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            char current = str.charAt(i);

            // Push opening brackets onto the stack
            if (current == '(' || current == '{' || current == '[') {
                stack.push(current);
            }
            // Check for closing brackets and match with the top of the stack
            else if (current == ')' || current == '}' || current == ']') {
                if (stack.isEmpty()) {
                    return false; // No matching opening bracket
                }
                char top = stack.pop();
                if (!isMatchingPair(top, current)) {
                    return false; // Brackets don't match
                }
            }
        }

        // If the stack is empty at the end, the brackets are balanced
        return stack.isEmpty();
    }

    // Helper method to check if a pair of brackets matches
    private static boolean isMatchingPair(char opening, char closing) {
        return (opening == '(' && closing == ')') ||
               (opening == '{' && closing == '}') ||
               (opening == '[' && closing == ']');
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Take user input
        System.out.print("Enter a string with brackets: ");
        String input = scanner.nextLine();

        // Check if the string has balanced brackets
        if (isBalanced(input)) {
            System.out.println("The brackets are balanced.");
        } else {
            System.out.println("The brackets are not balanced.");
        }
        
    }
}
