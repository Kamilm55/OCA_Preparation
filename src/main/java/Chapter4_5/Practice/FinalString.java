package Chapter4_5.Practice;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

// Ch9_2,12,25
public class FinalString {
    public static void main(String[] args) {
        // 2
        // When we say String is final, it refers to the class definition, not the variable itself.
        // This has two main implications:
        //
        //Final Class:
        //You cannot extend the String class to create a subclass.
        //This ensures the behavior of String remains consistent and secure.
        // Why is reassignment allowed?
        //The final nature of the String class ensures that the internal state of a String object
        // cannot be changed (immutability). However, the variable s is just a reference,
        // and you can reassign it unless the variable itself is declared final

        final String s = "Hello";
//        s = "World";  // Compilation error: cannot reassign a final variable.
        //In short, String Class is final to preserve its immutability and security,
        // but reassignment of a String reference is allowed unless the reference itself is declared final.

        // 25
        List ballons = new ArrayList<>();// valid
        List ballons2 = new ArrayList();// valid

        // On the left <> --> define type ---> Never compile empty diamond on the left
//        List<> ballons3 = new ArrayList<>(); // not valid
//        List<> ballons4 = new ArrayList();// not valid

        // On the right <> --> infer for the left
        List ballons5 = new ArrayList<>();// valid
        // This statement:
        //
        //List balloons5:
        //Declares a raw type List without specifying a type parameter.
        //This means balloons5 can hold any type of objects (not type-safe).
        //
        //new ArrayList<>():
        //The diamond operator (<>) infers(tür çıkarımı -> geliştiricinin açıkça belirtmediği bir türü ya da değeri, mevcut bağlama bakarak kendi başına tahmin eder.)
        // the type argument from the context.
        //However, since the variable balloons5 is declared as a raw type, the inferred type in this case is Object.


        Predicate predicate = c -> c.equals("tst"); // Predicate Generic type is inferred as Object type
    }
    // 12
    public static void secret(ArrayList<String> mystery){
        // Valid type of param:
        // ArrayList mystery
        // ArrayList<String>

        // ArrayList<> mystery -> not compile --> Identifier expected

    }
}
