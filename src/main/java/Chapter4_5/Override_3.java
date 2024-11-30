package Chapter4_5;

import java.io.FileNotFoundException;
import java.io.IOException;

class Parent2 {
    // This method throws a checked exception
    public void doSomething() throws IOException {
        System.out.println("Doing something in Parent");
    }
}

class Child2 extends Parent2 {
    // Valid override: does not throw any checked exceptions
    @Override
    public void doSomething()  {
        System.out.println("Doing something in Child");
    }
}

class AnotherChild2 extends Parent2 {
    // Valid override: throws the same checked exception as Parent
    @Override
    public void doSomething() throws IOException {
        System.out.println("Doing something in AnotherChild");
    }
}
class AnotherChild3 extends Parent2 {
    // Valid override: throws the narrower checked exception than Parent
    @Override
    public void doSomething() throws FileNotFoundException {
        System.out.println("Doing something in AnotherChild3");
    }
}

class InvalidChild2 extends Parent2 {
    // This will cause a compilation error because it throws a 'new' checked exception
//    @Override
//    public void doSomething() throws SQLException {
//        System.out.println("Doing something in InvalidChild");
//    }
}

class BroaderExceptionChild2 extends Parent2 {
    // This will cause a compilation error because it throws a 'broader' checked exception
//    @Override
//    public void doSomething() throws Exception {
//        System.out.println("Doing something in BroaderExceptionChild");
//    }
}

// Override 3rd principle --> The method in the child class may not throw a 'checked' exception that is new or
// broader than the class of any exception thrown in the parent class method.
public class Override_3 {
    public static void main(String[] args) throws IOException {
        Parent2 parent = new Child2();
        parent.doSomething(); // Valid -> Doing something in Child

        Parent2 anotherChild = new AnotherChild2();
        anotherChild.doSomething(); // Valid -> Doing something in AnotherChild


         Parent2 invalidChild = new InvalidChild2();
//         invalidChild.doSomething();// COMPILE ERROR -> imagine override with new ex

        Parent2 broaderExceptionChild = new BroaderExceptionChild2();
//        broaderExceptionChild.doSomething(); // COMPILE ERROR ->  -> imagine override with broader ex

        // Root Causes of the Principle:
        //  Contract Integrity: The parent class defines a contract for what exceptions can be expected
        // during the execution of its methods.
        // If a subclass could throw new or broader exceptions, it would break this contract,
        // making it unpredictable for users of the parent class.
        //
        //  Polymorphic Behavior: When working with polymorphic references (e.g., a Parent reference
        // pointing to a Child), clients expect consistent exception handling.
        // If a subclass throws different or broader exceptions, it complicates error handling and
        // can lead to runtime issues.


        // A child class method can declare new or different unchecked exceptions
        // (such as RuntimeException or its subclasses) when overriding a parent class method.
        //This is allowed because unchecked exceptions do not need to be explicitly handled or declared
        // in the method signature, so they don't impact the method's contract in the same way checked exceptions do.
    }


}

