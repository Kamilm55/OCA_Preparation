package OCA.Chapter4_5;
 interface CanHop {}
/*protected*/ abstract class Abs{} // Modifier 'protected' not allowed here -> if it is not inner
 class Frog implements CanHop {
    public static void main(String[] args) {
        CanHop frog = new TurtleFrog();
        //  In Java, an object of a subclass can be treated as an object of its superclass
        //  or any interface it implements, allowing polymorphism. Since TurtleFrog inherits from Frog,
        //  and Frog implements CanHop, TurtleFrog is considered to implement CanHop as well.

        // If Superclass impl the CanHop
        // Subclass must be able to assigned to CanHop
    }
}

 class BrazilianHornedFrog extends Frog {}
 class TurtleFrog extends Frog {}
public class Review_3_Ch_5 { // not allow protected
}
