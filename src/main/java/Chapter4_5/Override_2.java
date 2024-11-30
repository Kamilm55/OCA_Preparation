package Chapter4_5;

// 2nd rule of Override -> The method in the child class must be at least as accessible or more accessible than the
//method in the parent class.
class Parent {
    // This method is protected
    protected void display() {
        System.out.println("Display from Parent");
    }
}

class Child extends Parent {
    // This method is also protected, which is valid
    protected void display() {
        System.out.println("Display from Child");
    }
}

class AnotherChild extends Parent {
    // This method is public, which is more accessible than protected
    public void display() {
        System.out.println("Display from AnotherChild");
    }
}

class InvalidChild extends Parent {
    // This will cause a compilation error because private is less accessible than protected
    // private -> cannot callable by the Parent reference
//    private void display() {
//        System.out.println("Display from InvalidChild");
//    }

    private void privateMethod() {
        System.out.println("Display from privateMethod");
    }

}

public class Override_2 {
    public static void main(String[] args) {
        Parent parent = new Child();
        parent.display(); // Displays: Display from Child

        Parent anotherChild = new AnotherChild();
        anotherChild.display(); // Displays: Display from AnotherChild

        Parent invalidChild = new InvalidChild();
        invalidChild.display(); // but inside the obj, the method is less accessible
//        invalidChild.privateMethod();// not compile --> cannot callable by the Parent reference

        // ROOT CAUSE OF THIS PRINCIPLE

        // 1. In polymorphic behavior, a reference of a parent type can refer to an object of a child type.
        // If a child class could restrict access to its overridden methods,
        // it would violate the expectations set by the parent class's interface.
        // This means that code designed to work with the parent class would not function properly with the child class,
        // leading to confusion and potential runtime errors.

        // 2. Access modifiers are used to control the visibility of class members and enforce encapsulation.
        // Allowing a child class to restrict access to an overridden method would break the encapsulation
        // provided by the parent class. For example, if the parent class provides a method that is meant
        // to be accessible to its users, a child class should not be able to hide or restrict access to that method.
    }
}
