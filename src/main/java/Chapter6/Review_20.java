package Chapter6;

public class Review_20 {
    // In a single try-catch block, only one catch clause can be executed for a given exception
    // thrown within that try block. If multiple exceptions are thrown, the first matching catch block
    // for the thrown exception will handle it, and subsequent catch blocks will be skipped.

    // The catch block is responsible for catching exceptions thrown from the try block,
    // not from within the catch block itself.
    public static void main(String[] args) {
        System.out.print("a");
        try {
            System.out.print("b");
            throw new IllegalArgumentException();
        } catch (IllegalArgumentException e) {// It catches and remaining catches skipped/ignored
            System.out.print("c");
            throw new RuntimeException("1");
        } catch (RuntimeException e) {
            System.out.print("d");
            throw new RuntimeException("2");
        } finally {
            System.out.print("e");
            throw new RuntimeException("3");
        }
    }

}
