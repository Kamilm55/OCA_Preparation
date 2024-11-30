package Chapter3;

public class String_replace_trim {
    public static void main(String[] args) {
        System.out.println("abcabc".replace('a','A'));// AbcAbc
        System.out.println("abcabc".replace("a","ABBB"));// ABBBbcABBBbc


        System.out.println(" a b c   ".trim());// "a b c"
        System.out.println();
        //
        System.out.println("\t  a b c\n\td");
        System.out.println("\t  a b c\n\td".trim());// only affects in fist line trim before '\n'

        System.out.println();
        // The trim() method in Java removes only leading and trailing spaces from the beginning and
        // end of the string,
        // but it does not remove any embedded whitespace (e.g., tabs, newlines, or spaces between characters).
        System.out.println("a\tb");// "a  b"
        System.out.println("a\tb".trim());// "a  b"

        System.out.println("Hello World!\\rGoodbye: The \\r returns the cursor to the start of the line after printing \"Hello World!\".");
        System.out.println("Hello World!\rGoodbye"); // Goodbye

        System.out.println("//");
        //
        System.out.println("animal".replace('a','A'));// AnimAl
    }
}
