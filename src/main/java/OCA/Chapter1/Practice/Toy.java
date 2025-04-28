package OCA.Chapter1.Practice;
// Ch2 test48
public class Toy {
    public void play(){
        System.out.print("play-");
    }

    protected void finalize() throws Throwable {
        System.out.print("clean-");
    }

    public static void main(String[] args) {
        // 1st scenario: B
        Toy car = new Toy();
        car.play();// play-
        System.gc();// NO UNREFERENCED OBJS, even if it runs there is nothing to collect

        Toy doll = new Toy();
        doll.play();// play-

        // 2nd scenario: D
        Toy car2 = new Toy();
        car2.play();// play-
        System.gc();// NO UNREFERENCED OBJS, even if it runs there is nothing to collect

        Toy doll2 = new Toy();
        doll2.play();// play-
        // End of the main both collected and clean- clean-

        // End of main Does Not Force Garbage Collection: When the main method finishes,
        // the JVM doesn’t necessarily force a garbage collection cycle on all objects in memory.
        // The JVM may decide to skip garbage collection if it’s about to terminate the process entirely,
        // as cleaning up memory isn’t necessary once the program ends.

        // Why C is possible?
        // 3rd scenario: B
        Toy car3 = new Toy();
        car.play();// play-
        System.gc();// NO UNREFERENCED OBJS, even if it runs there is nothing to collect (Whenever we call again, it does not work)

        Toy doll3 = new Toy();
        doll.play();// play-
        // at then end of the main it calls gc for both objs, but does not work for first
        // works for second, which prints --> play-play-clean- (clean-) -> for 2nd obj

    }
}
