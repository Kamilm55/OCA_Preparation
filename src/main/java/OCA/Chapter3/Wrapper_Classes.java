package OCA.Chapter3;

public class Wrapper_Classes {
    public static void main(String[] args) {
        // If there is "parse", it converts into PRIMITIVE
        boolean parsedBoolean = Boolean.parseBoolean("TrUe");// Ignore case
//        Boolean parsedBoolean = Boolean.parseBoolean("TrUe"); // valid -->  autoboxing
        System.out.println(parsedBoolean);// true

        // If there is "valueOf", it converts into Wrapper class
        Boolean valueOfWrapper = Boolean.valueOf("falsE");// Ignore case
//        boolean valueOfWrapper = Boolean.valueOf("falsE");// valid --> unboxing
        System.out.println(valueOfWrapper);// false

//        public static Character valueOf(char c);
        Character ch =  Character.valueOf('A');// compile in java 8
//        Character.parse     // Not compile
        System.out.println(ch);
    }
}
