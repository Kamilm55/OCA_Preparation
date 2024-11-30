package Chapter3;

import Chapter4_5.DefaultClass;

public class Varargs extends DefaultClass {
    public static void main(String... original) {
//        String... copy = original; // Compile error->  java: not a statement
        String[] copy = original; // WORKS


//        DefaultClass defaultClass = new DefaultClass();
//        defaultClass.field = 5; // NOT COMPILE --> default access field
    }
}
