package Chapter1;

//ERROR!
//        Error: Main method not found in class 'CodeWithoutMainMethod', please define the main method as:
//public static void main(String[] args)
//        or a JavaFX application class must extend javafx.application.Application

public class CodeWithoutMainMethod {
    public static void test (String[] args) {
    // COMPILES but THROWS AN ERROR AT RUNTIME without exactly 'main' -> if we
    }

    public static void main(String args) { // Compile,  THROWS AN ERROR AT RUNTIME

    }

    public static void main(String args[],String other) {// Compile, THROWS AN ERROR AT RUNTIME

    }

    public static void main(String[] args) { // valid
        // NOTE: Optional modifiers can generally appear in any order relative to each other,
        // except they must come before the type and name.

    }
     static private int num;// valid
    final public String s = null;// valid
    // abstract can be before class
}

