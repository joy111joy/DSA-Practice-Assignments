import org.example.DoubleDimensionArray;

public class Main {
    public static void main(String[] args) {
        // Create a 3x3 double-dimension array
        DoubleDimensionArray array = new DoubleDimensionArray(3, 3);

        // Insert elements
        array.insert(0, 2, 10);
        array.insert(1, 1, 20);
        array.insert(2, 2, 30);

        // Traverse and print array
        array.traverse();

        // Search for an element
        array.search(20); // Should find it
        array.search(100); // Should not find it

        // Delete an element
        array.delete(0, 0);
        array.traverse(); // Traverse to see updated array

        // Try deleting at an invalid index
        array.delete(5, 5); // Should give an error
    }
}
