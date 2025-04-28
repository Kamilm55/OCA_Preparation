package OCA.Chapter6;

import java.io.File;
import java.io.FileNotFoundException;

public class ThrownBy {
    public static void main(String[] args) {
        // Runtime exceptions extend RuntimeException. They don’t have to be handled or declared.
        // They can be thrown by the programmer or by the JVM.

        int age = -5; // assume it is dynamic

        // Thrown by the Programmer:
        if (age < 0) {
            throw new IllegalArgumentException("Age cannot be negative.");
        }

        // Thrown by the JVM:
        int[] arr = new int[5];
        System.out.println(arr[10]); // This will throw an ArrayIndexOutOfBoundsException

    }

    // "Thrown programmatically" means that the exception is generated deliberately by the programmer
    // to handle specific error conditions, allowing for better error handling and
    // control over the flow of the program --> Checked exceptions
    public void readFile(String filePath) throws FileNotFoundException {
        File file = new File(filePath);
        if (!file.exists()) {
            // "Thrown programmatically" refers to the action of explicitly generating an exception
            // in code using the throw statement.
            throw new FileNotFoundException("File not found: " + filePath);
        }
        // Code to read the file
    }
}
