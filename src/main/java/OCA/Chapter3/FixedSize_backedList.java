package OCA.Chapter3;

import java.util.Arrays;
import java.util.List;

public class FixedSize_backedList {

    public static void main(String[] args) {
//        Key Differences between Arrays.asList() (Fixed-Size List) and ArrayList
//
//        Mutability of Size:
//        Arrays.asList(): Produces a fixed-size List, which means you cannot add or remove elements. Any attempt to modify the list size (e.g., using add() or remove()) throws an UnsupportedOperationException.
//        ArrayList: Allows dynamic resizing. You can freely add or remove elements, and ArrayList manages its own internal storage independently.
//
//        Backing the Array:
//        Arrays.asList(): The List returned is backed by the original array, meaning any changes to the array are reflected in the List, and vice versa. When you call set() on the List, it modifies the original array.
//        ArrayList: It stores a 'copy' of the data separately. Any changes made to the original array (if one was used to initialize the ArrayList) do not affect the ArrayList, nor do changes to the ArrayList affect the original array.
//
//        Performance and Use Case:
//        Arrays.asList(): Quick and lightweight, as it doesn’t need to create a new internal storage structure. It’s ideal when you need a List view of an array without modifying the list size, especially for iteration or read-only access.
//        ArrayList: More flexible and robust for general-purpose use cases where you need to dynamically add, remove, or reorganize elements.


        String[] array = { "hawk", "robin" };
        List<String> list = Arrays.asList(array); // Returns a fixed-size list backed by 'array'

        System.out.println(list.size()); // Output: 2

        list.set(1, "test"); // Changes both 'list' and 'array'
        System.out.println(Arrays.toString(array)); // Output: [hawk, test]

        array[0] = "new"; // Changes both 'array' and 'list' because 'list' is backed by 'array'
        System.out.println(list); // Output: [new, test]

        list.remove(1); // Throws UnsupportedOperationException

    }
}
