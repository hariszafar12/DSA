package DSA;

import java.util.Stack;
import java.util.Scanner;

public class UndoRedoProgram {
    // Stacks for undo and redo operations
    private Stack<String> undoStack = new Stack<>();
    private Stack<String> redoStack = new Stack<>();

    // Insert an action to the undo stack and clear redo stack
    public void insert(String action) {
        undoStack.push(action);
        redoStack.clear(); // Clear redo stack because we have a new action
    }

    // Undo the last action
    public void undo() {
        if (!undoStack.isEmpty()) {
            String action = undoStack.pop();
            redoStack.push(action); // Move the action to the redo stack
            System.out.println("Undo: " + action);
        } else {
            System.out.println("No actions to undo.");
        }
    }

    // Redo the last undone action
    public void redo() {
        if (!redoStack.isEmpty()) {
            String action = redoStack.pop();
            undoStack.push(action); // Move the action back to the undo stack
            System.out.println("Redo: " + action);
        } else {
            System.out.println("No actions to redo.");
        }
    }

    // Display the current state of the undo stack
    public void display() {
        System.out.println("Current Stack: " + undoStack);
    }

    public static void main(String[] args) {
        UndoRedoProgram program = new UndoRedoProgram();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Please enter your choice (1 for insert, 2 for undo, 3 for redo, 4 to display stack, 0 to exit): ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter action to insert: ");
                    String action = scanner.nextLine();
                    program.insert(action);
                    break;
                case 2:
                    program.undo();
                    break;
                case 3:
                    program.redo();
                    break;
                case 4:
                    program.display();
                    break;
                case 0:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}

