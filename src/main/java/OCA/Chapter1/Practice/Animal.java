//package Chapter1.Practice;
//// Assessment Test 16
//
//// What individual changes, if any, would allow the following code to compile? (Choose all
////that apply)
//
////A. The code compiles without issue.
////B. Remove the default method modifier and method implementation on line 1.
////C. Remove the default method modifier and method implementation on line 2.
////D. Remove the default method modifier and method implementation on lines 1 and 2.
////E. Change the return value on line 1 from null to "Animal".
////F. Override the getName() method with an abstract method in the Otter class.
////G. Override the getName() method with a concrete method in the Otter class.
//
//// D F G
//public interface Animal { public default String getName() { return null; } }
//interface Mammal { public default String getName() { return null; } }
//abstract class Otter implements Mammal, Animal {
//    // G
////    public String getName() { return null; } // Overriden from escaping ambiguity
//    // F
////    public abstract String getName(); // Overriden from escaping ambiguity
//// It does not think which interface default method impl it should use,
//// even if it is abs, it can be because of abs, class when we refer to this abs method,
//// it says you must override which is not ambiguous in this case.
//    // D -> includes 2 abs method
//
//    // B or C
//    // They are also ambiguous, when we call whether it selects as default impl or as abs
//
//}
//// D -> all are abs, and inherited as abs
//public interface Animal { public String getName(); }
//interface Mammal { public  String getName(); }
//
//class Example3 extends Otter {
//
//    // Following code means we override Otter's abs method
//    // If we don't specify overriden as abs in abs class it remains as abs
//    @Override
//    public String getName() {// if we comment out, we get c.e
//        return null;
//    }
//}