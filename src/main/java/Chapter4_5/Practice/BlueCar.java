package Chapter4_5.Practice;
// Ch_7 -> 27

class UnrelatedClass {
//    public static void main(String[] args) {
//
//    }// it triggers to print static init (main method) or we can call UnrelatedClass (if we run this psvm )
    static {
        System.out.println("Unrelated static init"); // never prints
    }
}
abstract class Car {
    static {System.out.println("1");}// Whenever load Class, it executes
    public Car(String name){
        super();
        System.out.println("2");
    }
    {System.out.println("3");}
}
public class BlueCar extends Car { // if we comment "extends Car" -> Nothing related to the Parent printed
    {
        System.out.println("4");
    }
    public BlueCar() {
        super("blue");
        System.out.println("5");
    }

    static {
        System.out.println("Static init in Child -> which contains main method");
    }

    public static void main(String[] args) {
        // Always start with main method, when you think about init order
        // main() -> BlueCar.main() -> this means load the BlueCar ...

        // Static blocks are executed when the class is loaded by the JVM. This happens
        // before any instance of the class is created and before any static or instance methods are called.

        // The JVM first loads the BlueCar class. However, because BlueCar extends Car,
        // the Car class must be loaded first (since the parent class must be initialized before the child class).

        // new BlueCar(); -> when comment out -> only prints 1 ,then --> Static init in Child -> which contains main method

        new BlueCar();// -> first Parent instance init runs -> 3 , 2 (after statics)
        // then actual class init -> 4 , 5

        // why 2 before 4? -> when initialize the parent also it init its constructor?
        // but we don't init child's constructor which implicitly call to parent?

        // The parent constructor (Car) is always called first when an object is created. This is because:
        //
        //Object creation starts from the parent class up to the child class.
        //The parent constructor is responsible for initializing the parent part of the object.
        //After the parent class constructor completes, the child class instance initialization blocks and constructor execute.


//        Why super("blue") is not called twice?
//        When you ask about the initialization process not "calling methods" again, it’s important to clarify how object initialization works in Java:
//
//        Key Concept: Object Initialization vs. Method Invocation
//        Initialization Order:
//
//        The initialization order refers to the sequence of static blocks, instance blocks, and constructors that are executed during object creation.
//         This sequence happens once per object during construction and does not involve re-calling any method or constructor unless explicitly coded to do so.
//
//        Method/Constructor Execution:
//         During object creation, the parent constructor is called exactly once as part of the child constructor's super() call.
//         Once a constructor finishes execution, it does not go back to the super() constructor unless a new object is created.
    }
}


