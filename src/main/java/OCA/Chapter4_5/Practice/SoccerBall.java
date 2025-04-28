package OCA.Chapter4_5.Practice;

import java.util.List;

// Ch7_29
/*abstract*/ /*final*/ class Ball{
    protected final int size;
    public Ball(int size){
        this.size = size;
    }
}
interface Equipment{}
class EquipmentClass{}
public class SoccerBall extends Ball implements Equipment {
    public SoccerBall() {
        super(5);
    }

    public Ball get() { return this;}
    public static void main(String[] args) {
        Equipment equipment = (Equipment) (Ball) new SoccerBall().get();
        // Order of Operations:
        //new SoccerBall().get() is evaluated first: (in anonymous call of constructor it consider actual class of constructor -> new SoccerBall() - SoccerBall as reference )
        //This calls the get() method on the SoccerBall instance.
        //get() returns this, which is a reference to the current SoccerBall object.->  Ball ball = new SoccerBall().get();
        //
        //Casts are applied after get():
        //First, the result of get() (SoccerBall object) is cast to Ball.
        //Then, the Ball reference is cast to Equipment.

        // Cast Step by step

        Ball ball1 = new SoccerBall().get();
        Ball ball2 = (Ball) new SoccerBall().get();
        Equipment equipment2 = (Equipment) new SoccerBall().get();// It is castable because of actual obj -> not matter previous Reference type
        Equipment equipment3 = (Equipment) (Ball) new SoccerBall().get();// same , (Casting 'new SoccerBall().get()' to 'Ball' is redundant)

        System.out.println(((SoccerBall) equipment).size);

        // Cast does not look reference type, instead it looks underlying obj
        Equipment eq = (Equipment) new Ball(4);// compiles but will throw a ClassCastException at runtime.
//        Equipment eq2 = new Ball(4); // NOT COMPILE
//        EquipmentClass eq = (EquipmentClass) new Ball(4);// NO COMPILE
        // Compiler behaves more tolerant to interface rather than class
        // If you try to cast an object to a class type that it's not related to, the compiler throws an error.
        //However, when casting to an interface type, the compiler only checks if the class being casted could potentially implement the interface.
        // This check is more permissive because any class can potentially implement any interface, even if it currently doesn’t.

        // Ball is not final and could potentially have a subclass that implements Equipment -> if it would be final class --> all casts not compile

       //Class Cast vs. Interface Cast:
        //Class cast: If you attempt (EquipmentClass) new Ball(4);, the compiler fails immediately because Ball and EquipmentClass have no relationship.
        //Interface cast: The compiler allows (Equipment) new Ball(4); because it's possible (in theory) for Ball or its subclasses to implement Equipment.


//        List l =  (List) new String(); // NOT COMPILE --> String is final class
        List l2 = (List) new Ball(4);// COMPILE --> Ball isn not final -> But class cast ex
    }
}
