package Chapter1.Practice;

import java.util.function.Predicate;

public class Assesment_17 {
     public static void main(String []args) {
//         System.out.println(test((i) -> { i == 5;}));// must be return if braces exist
//         System.out.println(test((i) -> return i == 5));

//         {return /* *** */ ;} //  -> required if braces exist
         System.out.println(test((i) -> { return i == 5;}));
//         System.out.println(test((int i) -> i == 5)); // c.err -> Incompatible parameter types in lambda expression: expected Integer but found in

         System.out.println(test((Integer i) -> i == 5));
     }
 private static boolean test(Predicate<Integer> p) {
         return p.test(5);
     }

     // Autoboxing
 public static void ex1(int i){
         ex2(i);
     }

 public static void ex2(Integer i){
        ex1(i);
    }
}
