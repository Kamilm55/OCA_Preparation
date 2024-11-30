//package org.example.Assessment;
//
//// Assessment test no_3 in introduction
//interface HasTail { int getTailLength(); }
// abstract class Puma implements HasTail {
//   protected int getTailLength() {return 4;} // --> to assign weaker access privileges "('protected'); was 'public' --> more restrictive access modifiers than which is implemented from
// }
//
//
// public class Cougar extends Puma { // ---> first compile error causes to this line compile error, if we change protected to public, automatically 2 compile errors lost
//    // If any class that contains invalid declaration of the method,
//    // it causes to other compile error in line -> which we extend/implement from this class(which includes invalid method declaration)
//
//     // Puma is class -> invalid method declaration
//     // Cougar -> which we extend/implement from this class
//     //  class Cougar extends Puma ---> causes to error (not directly, actually there is no error syntactically, if we solve problem in parent class it automatically has solved )
//
//    public static void main(String[] args) {
//      Puma puma = new Puma(); // ---> 'Puma' is abstract; cannot be instantiated
////      System.out.println(puma.getTailLength());
//    }
//
//  public int getTailLength(int length) {return 2;}
// }
//
//
//// Check that this rule belong to only abstract class or all? -> ALL
//class Puma2 implements HasTail {
//    protected int getTailLength() {return 4;} // --> getTailLength()' in 'org.example.Assessment.Puma' clashes with 'getTailLength()' in 'org.example.Assessment.HasTail'; attempting "to assign weaker access privileges "('protected'); was 'public' --> more restrictive access modifiers than which is implemented from
//}
//class Cougar2 extends Puma2 { // Again compile error
//    public static void main(String[] args) {
//        Puma2 puma = new Puma2();
//      System.out.println(puma.getTailLength());
//    }
//        public int getTailLength(int length) {return 2;}
//    }
