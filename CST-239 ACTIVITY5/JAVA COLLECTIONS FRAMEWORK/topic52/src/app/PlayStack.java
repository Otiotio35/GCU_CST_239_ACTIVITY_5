package app;

import java.util.Iterator;
import java.util.Stack;

/**
 * Demonstrates basic operations with Stacks.
 * <p>
 * This class showcases operations such as push, peek, pop, and size
 * with Stacks containing both String and Integer types.
 * </p>
 */
public class PlayStack {

    /**
     * Default constructor for the PlayStack class.
     */
    public PlayStack() {
        // Default constructor body (can be left empty)
    }
	/**
     * The main entry point for the application.
     * 
     * @param args Command line arguments. Not used in this application.
     */
    public static void main(String[] args) {
        // Set up a Stack of Strings
        Stack<String> stringStack = new Stack<>();
        stringStack.push("Mark Reha");
        stringStack.push("Mary Reha");
        stringStack.push("Justine Reha");
        stringStack.push("Brianna Reha");

        // Set up a Stack of Integers
        Stack<Integer> integerStack = new Stack<>();
        integerStack.push(1);
        integerStack.push(-1);
        integerStack.push(5);
        integerStack.push(10);

        // Print out size and second element in the Stack
        System.out.printf("Integer Stack Tests: size is %d and 2nd element is %d%n", integerStack.size(), integerStack.elementAt(1));

        // Use Iterator to get elements from the Stack
        // Note: It's atypical to use an iterator with a stack. A more conventional way is using pop() until the stack is empty.
        Iterator<String> itr = stringStack.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}
