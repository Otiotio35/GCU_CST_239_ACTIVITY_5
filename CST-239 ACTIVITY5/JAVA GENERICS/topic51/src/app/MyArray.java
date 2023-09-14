package app;

/**
 * This is the MyArray class, demonstrating generic methods.
 * It has a generic method printArray which prints any type of array.
 */
public class MyArray {

    /**
     * A generic method that prints all the elements of an array.
     * 
     * @param <E> the type of the elements in the array
     * @param inputArray an array of type E
     */
    public <E> void printArray(E[] inputArray) {
        // Iterate over the array and print each element
        for (E element : inputArray) {
            System.out.printf("%s ", element);
        }
        System.out.println();
    }

    /**
     * The main method which demonstrates the usage of the generic printArray method.
     * 
     * @param args command line arguments (unused)
     */
    public static void main(String[] args) {
        // Create arrays of Integer, Double, and Character
        Integer[] intArray = {1, 2, 3, 4};
        Double[] doubleArray = {1.1, 2.2, 3.3, 4.4};
        Character[] charArray = {'H', 'E', 'L', 'L', 'O'};

        // Instantiate the MyArray class
        MyArray ma = new MyArray();

        // Print each array out
        System.out.println("Array integerArray contains:");
        ma.printArray(intArray);  // pass an Integer array
        
        System.out.println("\nArray doubleArray contains:");
        ma.printArray(doubleArray);  // pass a Double array
        
        System.out.println("\nArray characterArray contains:");
        ma.printArray(charArray);  // pass a Character array
    }
}
