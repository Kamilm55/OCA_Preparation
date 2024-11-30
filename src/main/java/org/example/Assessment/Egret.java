package org.example.Assessment;

import java.time.LocalDate;
import java.time.Month;
import java.util.Calendar;
import java.util.function.Predicate;

// Assessment test no_12 in introduction
public class Egret {
    private String color;
    public Egret() {
    this("white");
    }
    public Egret(String color) {// param->local var shadows this.color
        color = color; // It sets method parameter to itself , this does not change instance variable
//        this.color = color; -> this changes instance variable
    }
    public  static final void  main(String[] args) {
     Egret e = new Egret();
     System.out.println("Color:" + e.color); // But we print instance variable
     }

    //    // Memorize predicate test no_17
    public static void main2(String[] args) {
        System.out.println(test((Integer i) -> {return i == 5;})); // Autoboxing works
    }
    private static boolean test(Predicate<Integer> p) {
        return p.test(5);// Autoboxing
    }
}

