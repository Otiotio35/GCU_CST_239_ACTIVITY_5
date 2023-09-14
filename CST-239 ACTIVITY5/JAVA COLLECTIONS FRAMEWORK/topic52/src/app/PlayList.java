package app;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * The Playlist class demonstrates operations on ArrayLists of Integers and Strings.
 * It showcases the addition of elements, retrieving elements, and iterating over the lists.
 * 
 * @author YourName (Replace this with your name or username)
 * @version 1.0
 */
public class PlayList {

    /**
     * The main method which serves as the entry point of the program.
     *
     * @param args The command-line arguments. Not used in this example.
     */
    public static void main(String[] args) {
        // Create a List of Integers and add elements using add
        List<Integer> integerList = new ArrayList<>();
        integerList.add(Integer.valueOf(10));
        integerList.add(Integer.valueOf(11));

        // Create a List of Strings and add elements using add
        List<String> stringList = new ArrayList<>();
        stringList.add("Hello World");
        stringList.add("Hi World");

        // Get first element from the List using get
        System.out.printf("Integer Value: %d%n", integerList.get(0));
        System.out.printf("String Value: %s%n", stringList.get(0));

        // Loop over the List using a For Loop
        for (Integer data : integerList) {
            System.out.printf("Integer Value: %d%n", data);
        }

        // Loop over the List using an Iterator
        Iterator<String> stringIterator = stringList.iterator();
        while (stringIterator.hasNext()) {
            System.out.printf("String Value: %s%n", stringIterator.next());
        }
    }
}
