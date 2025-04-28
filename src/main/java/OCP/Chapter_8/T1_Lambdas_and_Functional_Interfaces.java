package OCP.Chapter_8;

import java.util.ArrayList;
import java.util.List;

record Animal(String species, boolean canHop, boolean canSwim) { }
interface CheckTrait {
    boolean test(Animal a);
}
class CheckIfHopper implements CheckTrait {
    public boolean test(Animal a) {
        return a.canHop();
    }
}

// Swim-e gore check etmek
class CheckIfSwims implements CheckTrait {
    public boolean test(Animal a) {
        return a.canSwim(); // yalniz 1 line deyisdirdik,amma butun class-i yeniden yazmali olduq (serf elemir -> lambda daha qisa syntax ved edir)
    }
}

public class T1_Lambdas_and_Functional_Interfaces {
    public static void main(String[] args) {
        // list of animals
           var animals = new ArrayList<Animal>();
           animals.add(new Animal("fish", false, true));
           animals.add(new Animal("kangaroo", true, false));
           animals.add(new Animal("rabbit", true, false));
           animals.add(new Animal("turtle", false, true));

           // pass class that does check
           print(animals, new CheckIfHopper()); //  The print() method is very general— it can check for any trait.

           print(animals, new CheckIfSwims());

            // instead declaring new class (class CheckIfSwims,CheckIfHopper) --> we can use lambdas
            print(animals, a -> a.canSwim());
            print(animals, a -> a.canHop());
            //How about Animals that cannot swim?
            print(animals, a -> !a.canSwim());

            /***
             This code uses a concept called deferred execution.
             Deferred execution means that code is specified now but will run later.
             In this case, “later” is inside the print() method body,
             as opposed to when it is passed to the method.
             **/
            // Bizim 2-ci arqument olaraq verdiyimiz lambda , print metodunun icinde execute olur (checker.test(animal))
            // meselen checker.test(animal) kodunu cagirmasaq hec run olmayacaq, amma arqument olaraq specify olub
    }
   private static void print(List<Animal> animals, CheckTrait checker) {// Animal listini check edir, true olanlar return edir --> neye gore check etdiyi func. interfac-den asilidir, yalniz bu metodun icerisinde biz bile bilmerik
       for (Animal animal : animals) {

           // General check -> CheckTrait interfac-ni implement eden her hansi bir class-i gondersek check edecek
           // test() metodunun iceriyini bilmeye ehtiyac yoxdu.
           //  It shouldn’t need to know what specifically we are searching for in order to print a list of animals.
           if (checker.test(animal))
               System.out.print(animal + " ");
       }
       System.out.println();
   }
}
