package Chapter3;

public class String_Equals {
    // equals() method in String class
    // Compares this string to the specified object. The result is true if and only
    // if the argument is not null and is a String object that represents the same sequence of characters
    // as this object.
    //For finer-grained String comparison, refer to java.text.Collator.
    //Params:
    //anObject – The object to compare this String against
    //Returns:
    //true if the given object represents a String equivalent to this string, false otherwise
    //See Also:
    //compareTo(String), equalsIgnoreCase(String)
//    public boolean equals(Object anObject) {
//        if (this == anObject) {
//            return true;
//        }
//        return (anObject instanceof String aString)
//                && (!COMPACT_STRINGS || this.coder == aString.coder)
//                && StringLatin1.equals(value, aString.value);
//    }
    public static void main(String[] args) {
        String str = "str";
        StringBuilder sb = new StringBuilder("str");

        // BUT COMPILE OTHER THAN String class for -->  boolean equals(Object anObject)
        // All are subclasses of Object
//        (anObject instanceof String aString) // in return statement this returns false

        System.out.println(str.equals(sb));// false
        System.out.println("a".equals('A'));// false
        System.out.println("1".equals(1));// false

        System.out.println(str.equals(sb.toString()));// true
    }
}
