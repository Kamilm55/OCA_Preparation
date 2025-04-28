package OCA.Chapter6;

class DoSomething {

    // Print works until the exception happens
    public void go() {
        System.out.print("A");
        try {
            stop();
        } catch (ArithmeticException e) { // Cannot catch Null Pointer ex
            System.out.print("B");
        } finally {// Must be run even if, exception is thrown
            System.out.print("C");
        }
        System.out.print("D");// Not run because of exception cannot be caught
    }

    public void stop() {
        System.out.print("E");
        Object x = null;
        x.toString();// Null Pointer ex thrown
        System.out.print("F");
    }

    public static void main(String[] args) {
        new DoSomething().go();
    }
}

public class Review_7 {
}
