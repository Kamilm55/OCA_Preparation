package OCP.Chapter_8;

@FunctionalInterface
interface LearnToSpeak {
    void speak(String sound);
}
class DuckHelper {
    public static void teacher(String name, LearnToSpeak trainer) {
        // Exercise patience (omitted)
        trainer.speak(name);
    }
}
class Duckling {
    public static void makeSound(String sound) {
        LearnToSpeak learner = s -> System.out.println(s);
        // There’s a bit of redundancy, though. The lambda declares one parameter named s.
        // However, it does nothing other than pass that parameter to another method.
        // A `method reference` lets us remove that redundancy and instead write this:
        LearnToSpeak learnerMetReference = System.out::println; //  The :: operator tells Java to call the println() method later.


        DuckHelper.teacher(sound, learner);
    }
}

////// Functional Interfaces
interface Converter {
    long round(double num);
}
interface StringStart {
    boolean beginningCheck(String prefix); // input type String and one param, return boolean
}

interface StringParameterChecker {
    boolean check(String text);
}

interface StringTwoParameterChecker {
    boolean check(String text, String prefix);
}
interface EmptyStringCreator {
    String create();
}
////

public class T3_Using_Method_References {
    public static void main(String[] args) {

        // 1.Calling static method
        Converter methodRef = Math::round;
        Converter lambda = x -> Math.round(x);// x -> double, return value long
        System.out.println(methodRef.round(100.1));  // 100
        System.out.println(lambda.round(100.5)); // 101

        // in Math class method declaration:
    // public static long round(double a)

        /***
         You might be aware that the round() method is overloaded— it can take a
         double or a float. How does Java know that we want to call the version with a double? With
         both lambdas and method references, Java infers information from the context. In this case,
         we said that we were declaring a Converter, which has a method taking a double parameter.
         Java looks for a method that matches that description. If it can’t find it or finds multiple
         matches, then the compiler will report an error. The latter is sometimes called an ambiguous
         type error
         * **/

        // 2.  Calling Instance Methods `on a Particular Object`
        var str = "Zoo";// particular obj
        StringStart lambda2 = prefix -> str.startsWith(prefix);
        StringStart methodRef2 = str::startsWith;// parameter is defined in func. interface

        System.out.println(methodRef2.beginningCheck("A"));  // false

        // 3. Calling Instance Methods `on a Parameter`
        StringParameterChecker lambda3 = strInput -> strInput.isEmpty();
        StringParameterChecker methodRef3 = String::isEmpty; // Parameter-in type-i ile metodu cagiririq
        //*** The method that we want to call is declared in String. It looks like a static method, but it isn’t **

        System.out.println(methodRef3.check("Zoo"));  // false

        // Multiple params
        StringTwoParameterChecker lambdaa = (s, p) -> s.startsWith(p);
        StringTwoParameterChecker methodReff = String::startsWith;//*** Pay attention to the parameter order when reading the implementation **
        // The first one will always be the instance of the object for instance methods.
        // Any others are to be method parameters.

        System.out.println(methodReff.check("Zoo", "A"));  // false

        // 4. Calling Constructors
        EmptyStringCreator lambda4 = () -> new String(); // hec bir input yoxdur String return olmalidir --> "" empty String return olacaq
        EmptyStringCreator methodRef4 = String::new;
        var myString = methodRef4.create();// ""

        System.out.println(myString.equals(lambda4.create()));  // true
        System.out.println(myString == lambda4.create());  // false

    }
}
