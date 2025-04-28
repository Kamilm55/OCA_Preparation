package OCA.Chapter2;

public class NumericPromotion {
    public static void main(String[] args) {
        short x = 14; // --> auto change to int 32, IF IT IS USED IN ARITHMETIC OPERATOR OTHERWISE NOT
        // However, if you’re simply assigning a short value to a short variable or printing it, it remains a short
        float y = -13; // --> why compile?  implicit type conversion from int to float -> (TYPE IS FLOAT)
        // numeric literals like 13 without a decimal point are treated as int by default.->
        //        float y2 = 13.0;// ---> Not compile -> must be  13.0f or -> type = double
        double z = 30;

        float v1 = x * y; // int vs float --> float
        // -> When you perform arithmetic operations between an integer type (like int or short) and a floating-point type
        // (float or double), Java automatically converts the integer type to the corresponding floating-point type
        //'to avoid losing precision'.

        // If you mix an integer and a floating-point number in a calculation, Java will automatically
        // convert the integer to a floating-point number to match the type of the floating-point value.
        double v2 = x * y / z;  // double vs float -> double


    // Practice   float(32,floating-point) vs long(64,integral)
        long l = 64L;  // A long literal
        long l2 = 64;  // Also a long, even without 'L', because 64 fits in int and gets promoted

//        long l3 = 45555555555555;// COMPILE ERROR
        long l4 = 45555555555555l; // 'l' or 'L' for long
        //        float y = 13.5f; // A float value

        // 'l' (long) is promoted to 'float' for the multiplication
        float v = l * y; // Result is float, long is promoted to float

        // 'l2' (long) is also promoted to 'float'
        float v3 = l2 * y; // Result is float, same as above

        System.out.println("v = " + v);   // Output: v = 864.0
        System.out.println("v3 = " + v3); // Output: v3 = 864.0

        /*
        Even though long is larger in terms of bits, the promotion to float is based on the need
        to maintain the floating-point precision of the operation. As a result, the long is promoted to float automatically,
        allowing the multiplication to occur without compile-time errors, but with a possible loss of precision
        due to the nature of floating-point representation
        */

        // Implicit Widening
        short s = 10;    // short variable
        byte b = 20;     // byte variable
        char c = 'A';    // char variable (ASCII value 65)

        // Implicit widening conversion to long
        long longFromShort = s;  // short to long
        long longFromByte = b;   // byte to long
        long longFromChar = c;   // char to long

        System.out.println("longFromShort = " + longFromShort);  // Output: longFromShort = 10
        System.out.println("longFromByte = " + longFromByte);    // Output: longFromByte = 20
        System.out.println("longFromChar = " + longFromChar);    // Output: longFromChar = 65


        // Compound assignment operators
        long x1 = 10; // not 10L
        int y1 = 5;


        y1 *= x1; // x1-> to long , y1 -> to long ,then all (x1 * y1)-> cast to int

//        y1 = y1 * x1; // NOT COMPILE-->// Required type:
                                        //        int
                                        //        Provided:
                                        //        long


        System.out.println(y1);
    }


    /*
        If one of the operands is of type double, the entire expression is promoted to double.
        If one of the operands is of type float (and none are double), the entire expression is promoted to float.
        If one of the operands is of type long (and none are float or double), the entire expression is promoted to long.
        Otherwise, all operands are promoted to int.
    * */
 // x is a short, but gets promoted to int because of the first rule.
// y is a float.
// The expression x * y involves int (from x) and float (from y).
// According to the rules, since one of the operands (y) is a float, the entire expression (x * y) is promoted to float.



}
