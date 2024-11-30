package Chapter2;

// Review_10
public class Numeric_Promotion {
    public static void main(String[] args) {

        // Required type: byte
        // Provided: int
//        byte a = 40, b = 50;
//        byte sum = (byte) a + b;// a cast to byte from int, b is int -> promoted to int, but assign to a byte
//        System.out.println(sum);

        //
//        byte a = 40, b = 50;
//        byte sum = (byte) a + (byte) b;//  However, when performing the addition, they are automatically promoted to int.
//           attempted to cast each operand to byte, but this does not change the result type of the addition.
//           The addition of two byte values is still an int.
//        System.out.println(sum);

        //
        byte a = 40, b = 50;
        byte sum = (byte) (a + b); // Correctly cast the result to byte
        System.out.println(sum);

//        Summary
//        The addition of byte values results in an int, regardless of individual casts.

    }
}
