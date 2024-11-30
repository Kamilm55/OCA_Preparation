package org.example.Assessment;

import java.util.ArrayList;
import java.util.List;

// Assessment test no_15 in introduction
interface CanSwim {}
class Amphibian implements CanSwim {}
 class Tadpole extends Amphibian {}
public class FindAllTadPole {
    public static void main(String[] args) {
        List<Tadpole> tadpoles = new ArrayList<Tadpole>();

        for(Amphibian amphibian : tadpoles) { // For each auto cast to Amphibian -> because Tadpole extends Amphibian (tadpole is subclass of this)
//            Tadpole tadpole1 = /*(Tadpole)*/ amphibian; // It cannot be Tadpole type , child needs to explicit cast , parent does not
            CanSwim/*Amphibian,Object*/ tadpole = amphibian;

            // We can think of CanSwim is bigger box than Amphibian
            // TadPole is smaller box than Amphibian

            // Compile time -> Checks only box size --> If it is not unrelated ---> (in case of unrelated) It can be Object(or some built-in java classes) or Interface which implemented by the non-final class
            // Runtime -> checks for actual obj in memory  -> is related? AND size is enough?
        } } }

class X{
    static  int i;
    int j;

    public static void main(String[] args) {
        X x1 = new X();
        X x2 = new X();
        x1.i = 3; // X.i
        x1.j = 4;
        x2.i = 5; // X.i
        x2.j = 6;

        System.out.println(x1.i+ " " +x1.j + " " + x2.i + " " + x2.j);// 5 4 5 6

        Short sh = 45;
        Long l = 45L;
//        System.out.println(sh == l); // NOT COMPILE

        short shPrimitive = 45;
        long lPrimitive = 45L;
        System.out.println(shPrimitive == lPrimitive);
        System.out.println(shPrimitive == l);
        System.out.println(lPrimitive == sh);

        int i = 1234567890;
        float f = i;
        System.out.println(i - (int)f); // -46

        char chh = 15;
//        short shh = chh;// 16 vs 16 NOT COMPILE
        short sh2 = 15;
//        char ch2 = sh2;// 16 vs 16 NOT COMPILE

//        This will not compile because a short VARIABLE can NEVER be assigned to a char without explicit casting.
//        A short CONSTANT can be assigned to a char only if the value fits into a char.

//        short s = 1; byte b = s;// => this will also not compile because although value is small enough to be held by a byte but the Right Hand Side i.e. s is a variable and not a constant.
        final short s1 = 1; byte b1 = s1;// => This is fine because s is a constant and the value fits into a byte.
//        short s1 = 1; byte b1 = s1; // NOT COMPILE
//        final short s2 = 200; byte b2 = s2;// => This is invalid because although s is a constant but the value does not fit into a byte.

        float fl = 10.2F;

        byte b = 10;
        switch(b){
            case 100 : System.out.print(100); //OK
//            case 100 : // NOT COMPILE -> duplicate
//            case 200 :  System.out.print(200); //will not compile
        }
    }
}