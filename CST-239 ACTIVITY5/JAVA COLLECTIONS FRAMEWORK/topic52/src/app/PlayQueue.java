package app;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

/**
 * Demonstrates basic operations with Queues.
 * <p>
 * This class showcases operations such as offer, add, peek, remove, and size
 * with Queues containing both String and Integer types.
 * </p>
 */
public class PlayQueue {

    /**
     * The main entry point for the application.
     * 
     * @param args Command line arguments. Not used in this application.
     */
    public static void main(String[] args) {
        // Set up a Queue of Strings
        Queue<String> stringQueue = new LinkedList<>();
        stringQueue.offer("Mark Reha");
        stringQueue.add("Mary Reha");
        stringQueue.offer("Justine Reha");
        stringQueue.add("Brianna Reha");

        // Setup a Queue of Integers
        Queue<Integer> integerQueue = new LinkedList<>();
        integerQueue.add(1);
        integerQueue.offer(-1);
        integerQueue.add(5);
        integerQueue.offer(10);

        // Print out size and head element of the Queue
        System.out.println(stringQueue);
        System.out.printf("Integer Queue Tests: size is %d and head element is %d%n", integerQueue.size(), integerQueue.peek());

        // Use Iterator to get elements from the Queue
        Iterator<String> itr = stringQueue.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}
