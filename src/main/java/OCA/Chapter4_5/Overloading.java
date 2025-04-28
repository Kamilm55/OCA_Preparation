package OCA.Chapter4_5;

public class Overloading {
    public static void main(String[] args) {

    }
    public void fly(int num){}
//    private boolean fly(int num){ // Affect to both not to compile -> fly(int)' is already defined in 'Chapter4.Overloading'
//        return false;
    private boolean fly() throws Exception{return false;}// Overload
//    static int fly();// Cause not to compile of both duplicate methods -> Duplicate method with the method above

    public void fly(int[] arr){}
//    protected int fly(int... varargs){return 0;};//  Cause not to compile of both duplicate methods
    // int[] vs int... are considered as the same type in the param list
}
