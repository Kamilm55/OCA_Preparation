package Chapter4_5.Practice;

import java.io.IOException;

// Ch 10_17
class Fish{
    Fish parentMethod() throws IOException{throw new RuntimeException("1");}
}
public class ClownFish extends Fish{
    public ClownFish parentMethod() {throw new RuntimeException("2");}

    public static void main(String[] args) /*throws IOException*/ {
        Fish fish = new ClownFish();
//        fish.parentMethod();// Unhandled exception: java.io.IOException

        ClownFish clownFish = new ClownFish();
        clownFish.parentMethod();// valid

        //Liskov Substitution Principle:
        //When you call fish.parentMethod(), the reference type (Fish) determines the compile-time behavior.
        //The compiler checks against the method signature in the Fish class, which declares throws IOException.
        //Therefore, the caller must handle or declare IOException.

        // Why the Exception Handling Is Required:
        //The compiler cannot assume that fish.parentMethod() will execute ClownFish's version at runtime.
        //It must ensure IOException is handled as per the Fish class declaration to guarantee correctness in all cases.

        //Key Summary:
        //Left side (Fish): Determines compile-time method signature checks (e.g., exceptions).
        //Right side (new ClownFish()): Determines the actual method implementation at runtime.

    }
}
