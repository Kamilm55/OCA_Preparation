package Chapter6.Practice;

// Ch 8_33
public class Pr33 {
    public static void main(String[] args) {
        // No error even at runtime
        final Object exception = new Exception();// can be assigned to superclass
        final Exception data = (Exception) exception; // after cast to Object, we can assign to any class with explicit cast (valid for compile time,
        // but at runtime you must consider underlying obj)
        System.out.println(data);// prints -> java.lang.Exception

        // ClassCast exception at runtime
        final Object exception2 = new Exception();// can be assigned to superclass
//        final Exception data2 = exception2; // Reference type of exception2 is Object and bigger than Exception - NOT COMPILE
        final Exception data2 = (RuntimeException) exception2;// Reference type of exception2 casted to RuntimeException
        // which is smaller than Exception -  COMPILE but At runtime cast exception
        System.out.println(data2);
    }
}
