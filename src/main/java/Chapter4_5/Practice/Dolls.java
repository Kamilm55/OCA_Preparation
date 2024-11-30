package Chapter4_5.Practice;

// Ch_6 -> 4
public class Dolls {
    public void nested(){
        nested(2,true);// it returns int but we can ignore this

        int notIgnoredReturn = nested(2, true);

        // void -> we must not return anything
    }

    public int nested(int level, boolean height) {
        return nested(level);
    }
    public int nested(int level ) {
        return level + 1;
    }

    public void VoidMethod(){
        // Nothing in the code
    }
    public static void main(String[] args) {
//        System.out.println(new Dolls().nested()); // COMPILE ERROR

        Dolls dolls = new Dolls();
//        System.out.println(dolls.VoidMethod());// Cannot resolve method 'println(void)' -> COMPILE ERROR
        // We cannot print void method
        // But we can call it without print
        dolls.VoidMethod();
    }
}
