package Chapter4_5;

public class PassByValue {
    private String fieldOfMutableClass = "a";
    public static void main(String[] args) {
        String letters = "abc"; // Reference to string obj
        letters(letters);

        System.out.println(letters);// abc
        // Actually Calling methods on a reference to an obj affect the caller
        // BUT String is immutable

        letters = letters2(letters); // Reassign for immutability

        System.out.println(letters);// abcd

        PassByValue mutableObj = new PassByValue();
        letters3(mutableObj);

        System.out.println(mutableObj.fieldOfMutableClass);// abf
    }

    private static void letters3(PassByValue CopyOfMutableObj) {
        CopyOfMutableObj.fieldOfMutableClass += "bf";
    }

    private static void letters(String letters) {
        letters.concat("d");
    }
    private static String letters2(String copy) {
        copy = copy + "d";
        return copy;
    }
}
