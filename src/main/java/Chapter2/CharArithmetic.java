package Chapter2;

public class CharArithmetic {
    public static void main(String[] args) {
        char a = 'A'; // Unicode value 65
        char b = 'B'; // Unicode value 66

        // a and b data type are char

        // Addition of chars
        int sum = a + b; // Promoted to int
        System.out.println("Sum of char values: " + sum); // Outputs: 131

        // Convert back to char
        char sumAsChar = (char) sum; // Cast back to char
        System.out.println("Character representation: " + sumAsChar); // Outputs: 'Ç'

        // Incrementing a char
        char incrementedChar = 'A';
        incrementedChar++; // Now it's 'B' -> ++ unary --> implicit cast to char
        System.out.println("Incremented char post: " + incrementedChar); // Outputs: B
        ++incrementedChar;// --> implicit cast to char
        System.out.println("Incremented char pre: " + incrementedChar); // Outputs: C
        incrementedChar += 1;//  compound assignment -> implicit cast to char
        System.out.println("Incremented char with compound assignment: " + incrementedChar); // Outputs: C
//        incrementedChar = incrementedChar + 1;// compile error, need to explicit cast
        incrementedChar = (char) (incrementedChar + 1);
    }
}

