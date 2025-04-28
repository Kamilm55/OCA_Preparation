package OCA.Chapter4_5.Practice;
// Ch 10_54

interface Friend{
    String getName();
}
class Cat4 implements Friend{
    @Override
    public String getName() {
        return "Cat4";
    }
}
public class Dog4 implements Friend{
    @Override
    public String getName() {
        return "Dog4";
    }
    public static void main(String[] args) {
        Friend friend = new Dog4();

//        System.out.println(((Cat4) friend).getName());// Can be cast in compile time for shared interface
        // Note: At compile time, the cast is allowed because Dog4 and Cat4 share the Friend interface.
        // However, 'at runtime', castability depends on the actual instance type.
        // Since Dog4 and Cat4 are unrelated classes, attempting to cast Dog4 to Cat4 results in a ClassCastException.

        Dog4 nullDog = (Dog4) null; // Can be cast at runtime and compile time
        // but whenever call cause to nullPointer ex
//      System.out.println(((Dog4) null).getName());// Compile but ex -> compiles -> because getName is accessible default type inferred as Dog4


        // double prints 0 or 0.0?
        double db = 0;
        System.out.println(db);// 0.0

    }
}
