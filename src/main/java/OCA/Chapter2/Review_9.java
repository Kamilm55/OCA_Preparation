package OCA.Chapter2;

public class Review_9 {
    public static void main(String[] args) {

        // No update statement inside (), but there is in body post-increment
        for (int i = 0; i < 10; ) {// re-check 0 < 10
            i = i++;// i = 0(original value), then increment to 1 (but ignore incremented value)
            System.out.println("Hello World");
            // i = 0
        }

        // Pre-increment
        for (int i = 0; i < 10; ) {
            i = ++i;// i =  increment to 1 (set incremented value)
            System.out.println("Hello World");
            // i = 1,2,3....
        }
    }
}
