package Chapter4_5;

/*final*/ abstract class ExampleAbs{}
/*final */ abstract interface ExampleInterface{}
interface exInt2{}// multiple inheritance of interface is valid,not allowed multi-inheritance from abs/concrete class
class ConcreteClass extends ExampleAbs implements ExampleInterface,exInt2{}
public class AbsClassNotBeMarkedAsFinal {
    public static void main(String[] args) {
        // We cannot instantiate both
        // If we want to use just Reference type, not actual instance of own, we must be able to extend
        // Which final does not permit
        // If final would be allowed we cannot use these, only we are able to declare

        ExampleAbs concreteClass = new ConcreteClass();
        ExampleInterface concreteClass2 = new ConcreteClass();
    }
}

//
interface Walk {
default int getSpeed() {
        return 5;
        }
}

interface Run {
    default int getSpeed() {
        return 10;
    }
}

abstract class Animal4 implements Walk, Run {
    // If we do not implement getSpeed(), this class will not compile
    public int getSpeed() {
        // Resolving the ambiguity
        return Walk.super.getSpeed(); // or Run.super.getSpeed()
        // To resolve this ambiguity using the InterfaceName.super.methodName() syntax.
        //
        //Breakdown of Walk.super.getSpeed():
        //Walk: The name of the interface whose method you want to call.
        //super: Refers to the interface's implementation of the method.
        //getSpeed(): The method defined in the Walk interface.
    }
    // Or make it abstract -> but it must be impl in first concrete class
//    public abstract int getSpeed();

    // A concrete method that calls getSpeed()
    public void printSpeed() {
        System.out.println("Speed: " + getSpeed());
    }
}
