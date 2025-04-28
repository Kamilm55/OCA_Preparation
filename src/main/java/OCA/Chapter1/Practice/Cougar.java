//package Chapter1.Practice;
//// Assessment Test 3
//
//// When i run this app ->
//// 18:19
////java: getTailLength() in Chapter1.Practice.Puma cannot implement getTailLength() in Chapter1.Practice.HasTail
////  attempting to assign weaker access privileges; was public
//
//// 23:8
////java: getTailLength() in Chapter1.Practice.Puma cannot implement getTailLength() in Chapter1.Practice.HasTail
////  attempting to assign weaker access privileges; was public
//
//// 25:21
////java: Chapter1.Practice.Puma is abstract; cannot be instantiated
//
//interface HasTail { int getTailLength(); } // public abstract -> COMPILE // 2 impl of this interface
//abstract class Puma implements HasTail {// must be impl public int getTailLength();
//    protected int getTailLength() {return 4;} // public int getTailLength(); 1 c.e
//    // protected more restrictive than public -> cannot override the method
//
//}
//
//public class Cougar extends Puma {// -> 2 c.e (It is also impl of HasTail, because of Puma's child)
//    public static void main(String[] args) {
//        Puma puma = new Puma();// cannot instantiate abs class -> 3 c.e
//        System.out.println(puma.getTailLength());
//    }
//
//    // if we comment out following line c.e decreases to 2.
////    public int getTailLength() {return 2;}// assume that there is override
//
//    public int getTailLength(int length) {return 2;}// overload
// }
//
// // How many c.e exist in the following code? 2
// class Example implements HasTail{
//     @Override
//      int getTailLength() { // 1. c.e
//         return 0;
//     }
// }
//
// class InheritedFromExample extends Example {// 2 c.e
//
//     public void test(String[] args) {
//         InheritedFromExample i1 = new InheritedFromExample();
//         Example i2 = i1;// Cast to superclass
//         HasTail i3 = i1;// Cast to interface of superclass, there is no direct relation between them
//
//         i1.getTailLength();// this not properly overriden in parent,
//         // which means in the child also -> cause to 2 c.e
//
//
//         // Therefore
//         // Example -> must be impl all abs methods of HasTail
//         // InheritedFromExample -> also must be impl all abs methods of HasTail
//         // BUT IT MAY BE ALL ARE OVERRIDEN IN THE PARENT, WHICH THIS INHERITS FROM IT
//     }
//
//}
//
//// How many c.e exist in the following code? 0
//class Example2 implements HasTail{
//    @Override
//    public int getTailLength() { // Override correctly
//        return 0;
//    }
//}
//
//class InheritedFromExample2 extends Example2 {
//// NOTE: The issue here is that i1.getTailLength(); is written directly in the body of the InheritedFromExample2 class,
//// not within a method or constructor, which is why we cannot access it this way.
//// In Java, you can only call methods or perform actions like i1.getTailLength();
//// within the context of a method, constructor, or an initializer block.
//
//    InheritedFromExample2 i1 = new InheritedFromExample2();
//    // This class must be impl all abs methods of HasTail (interface of superclass)
//
//    // There is already method which is not visible at first sight, because it inherited from its parent
//    {
//        i1.getTailLength();// this means -> we successfully impl even in child class
//    }
//
//
//    Example2 i2 = i1;// Cast to superclass
//
//    HasTail i3 = i1;// Cast to interface of superclass, there is no direct relation between them
//
//}
//
//
//// If we extend 2 more examples from first
//class InheritedFromClassThatContainsCompileError extends InheritedFromExample{// line 93 -> c.e
//    public static void main() {
//        // InheritedFromClassThatContainsCompileError -> InheritedFromExample ->
//        // -> Example -> HasTail
//
//        // HasTail's public method must be overriden in InheritedFromClassThatContainsCompileError
//    }
//}
//// line 102 c.e
//class InheritedFromClassThatContainsCompileError2 extends InheritedFromClassThatContainsCompileError{
//    public static void main() {
//        // InheritedFromClassThatContainsCompileError2 ->InheritedFromClassThatContainsCompileError ->
//        // -> InheritedFromExample ->
//        // -> Example -> HasTail
//
//        // HasTail's public method must be overriden in InheritedFromClassThatContainsCompileError2
//    }
//}
//
