import org.example.DoubleDimensionArray;

public class Main {
    public static void main(String[] args) {
        // Create a 3x3 array
        DoubleDimensionArray array = new DoubleDimensionArray(3, 3);

        // Insert elements
        array.insert(0, 2, 10);
        array.insert(1, 0, 20);
        array.insert(2, 2, 30);

        // Traverse and print array
        array.traverse();

        // Search for an element
        array.search(20);
        array.search(100); 

        // Delete an element
        array.delete(0, 0);
        array.traverse(); 


    }
}
