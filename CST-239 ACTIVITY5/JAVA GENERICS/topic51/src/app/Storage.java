package app;

/**
 * The Storage class provides a generic way to store and retrieve a single item.
 *
 * @param <T> the type of item to be stored.
 */
public class Storage<T> {

    /** The item to be stored. */
    private T s;

    /**
     * Constructs a new instance of the Storage class.
     *
     * @param s the item to be stored.
     */
    public Storage(T s) {
        this.s = s;
    }

    /**
     * Retrieves the stored item.
     *
     * @return the stored item.
     */
    public T getData() {
        return this.s;
    }

    /**
     * Demonstrates the usage of the Storage class with String and Integer types.
     *
     * @param args command-line arguments (not used).
     */
    public static void main(String[] args) {
        Storage<String> storage1 = new Storage<String>("Mark Reha");
        System.out.println("This is the data: " + storage1.getData());

        Storage<Integer> storage2 = new Storage<Integer>(0); // I've added a sample integer value here.
        System.out.println("This is the data: " + storage2.getData());
    }
}
