package Chapter4_5.Practice;
// Shared Interface(not parent-child)
interface Pet {}
class Dog implements Pet {}
class Cat implements Pet {}
// Parent-Child Relationship
class Animal {}
class Dog1 extends Animal {}
class Cat1 extends Animal {}
public class Invalid_Cast {
    //When Casting Works
    //Casting is only valid in these scenarios:
    //
    //Parent-Child Relationship: If one class is a subclass of the other, you can cast between them.
    //Shared Interface(not parent-child): If both classes implement the same interface, they can be cast to that interface type (only compile time)
    // (but not directly to each other unless one is a subclass of the other).

    public static void main(String[] args) {
        Pet myPet = new Dog();  // Upcasting Dog to Pet (allowed)

//        Cat cat = new Dog();// COMPILE ERROR -> shared interface but directly to each other , one is not a subclass of the other
        Dog dog = new Dog();
//        dog = (Pet) dog; // NOT COMPILE -> dog Reference type is Dog not Pet
        Pet dogPet = (Pet) dog;// valid
        Pet dog2 = dog;
//        Cat cat = (Cat) dog; // NOT COMPILE -> Inconvertible types;

//        Cat1 dog1 = new Dog1();//  // NOT COMPILE
        Dog1 dog1 = new Dog1();

        Animal dogAnimal = dog1;
//        Cat1 cat1 = (Cat1) dog1; // Inconvertible types; cannot cast 'Dog1' to 'Cat1'

        Object dogObj = dog1;
        Cat1 cat = (Cat1) dogObj;// Compiles -> WHY Inconvertible types not occur ->  but throws ClassCastException at runtime
        // In other words, 'using Object bypasses the compile-time check', but the JVM still verifies types at runtime.
        // Since dogObj points to a Dog1 instance, trying to cast it to Cat1 results in a ClassCastException.
        // But if its reference explicit cast into itself or sub/super class after assigning to Object reference -> no exception

        Animal animal = new Animal();
        Cat1 cat1 = (Cat1) animal;// java.lang.ClassCastException


        Cat1 cat11 = (Cat1) new Animal(); // valid
        //
        String str = "";
        Object obj = str;

        Integer int1 = (Integer) obj;

        //
        Number num = int1;
        Double d = (Double) num;

        // Summary
//        When dealing with user-defined classes in Java, the compiler enforces stricter rules regarding
//        casting between types. This means that if you attempt to cast one class to another
//        that is not directly related through inheritance (i.e., no common parent-child relationship),
//        the compiler will detect this as a compile-time error and will prevent the cast from being performed.
//        In other words, the compiler will not allow any casting operation that could potentially lead to an invalid or incompatible type conversion,
//        ensuring that such errors are caught early in the development process.

//        In contrast, with built-in Java classes like String, Integer, or Object, the compiler allows more flexibility.
//        It allows you to cast from Object to any reference type without immediately flagging errors,
//        even if the actual object being referenced is not compatible with the target type.
//        This is because all classes in Java inherit from Object, and the compiler assumes that
//        the programmer may intend to handle type mismatches at runtime. As a result,
//        any issues related to incompatible types between built-in types are not detected until runtime,
//        where a ClassCastException might be thrown.
    }
}





