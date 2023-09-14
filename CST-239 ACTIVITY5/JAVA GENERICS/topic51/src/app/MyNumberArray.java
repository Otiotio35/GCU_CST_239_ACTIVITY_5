package app;

/**
 * The MyNumbersArray class demonstrates the usage of generic methods for Number types.
 */
public class MyNumberArray {

    /**
     * A generic method that prints elements of a Number array.
     *
     * @param <E> Type of the elements in the array. Must extend Number.
     * @param inputArray Array of type E to be printed.
     */
    public <E extends Number> void printArray(E[] inputArray) {
        // Iterate over the array and print each element
        for (E element : inputArray) {
            System.out.printf("%s ", element);
        }
        System.out.println();
    }

    /**
     * The main method to demonstrate the usage of the generic printArray method.
     *
     * @param args Command line arguments (not used).
     */
    public static void main(String[] args) {
        // Create arrays of Integer, Double, and Float
        Integer[] intArray = {1, 2, 3, 4, 5};
        Double[] doubleArray = {1.1, 2.2, 3.3, 4.4};
        Float[] floatArray = {0.0f, 1.0f, 2.5f, 3.5f};

        // Instantiate the MyNumbersArray class
        MyNumberArray ma = new MyNumberArray();

        // Print each array
        System.out.println("Array integerArray contains:");
        ma.printArray(intArray);  // Pass an Integer array

        System.out.println("\nArray doubleArray contains:");
        ma.printArray(doubleArray);  // Pass a Double array

        System.out.println("\nArray floatArray contains:");
        ma.printArray(floatArray);  // Pass a Float array
    }
}
