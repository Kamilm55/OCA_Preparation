package OCA.Chapter3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListToArray {
    public static void main(String[] args) {
        // Step 1: Create an ArrayList and add some elements
        List<String> list = new ArrayList<>();
        list.add("hawk");
        list.add("robin");

        System.out.println("Original list: " + list);

        // Scenario 1: Specifying an array of size 0
        String[] arraySizeZero = list.toArray(new String[0]);
        System.out.println("\nScenario 1: Specified array size 0");
        System.out.println("Returned array length: " + arraySizeZero.length);
        System.out.print("Array elements: ");
        System.out.println(Arrays.toString(arraySizeZero));

        // Scenario 2: Specifying a larger array size (size 5)
        String[] arraySizeFive = list.toArray(new String[5]);
        System.out.println("\n\nScenario 2: Specified array size 5");
        System.out.println("Returned array length: " + arraySizeFive.length);
        System.out.print("Array elements: ");
        System.out.println(Arrays.toString(arraySizeFive));

        // Scenario 3: Specifying a smaller array size (size 1)
        String[] arraySizeOne = list.toArray(new String[1]);
        System.out.println("\n\nScenario 3: Specified array size 1");
        System.out.println("Returned array length: " + arraySizeOne.length);
        System.out.print("Array elements: ");
        System.out.println(Arrays.toString(arraySizeOne));
    }
}
