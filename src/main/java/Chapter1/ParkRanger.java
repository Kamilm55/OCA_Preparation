package Chapter1;

// OCA Practice ch1 test no_12
public class ParkRanger {
    int num = 12;
    int birds = 10; // Non-static field 'birds'
    static int birdsStatic = 150; // Static field 'birds'
    public static void main(String[] args) {
        int trees = 5;
//        System.out.println(trees + birds);// Non-static field 'birds' cannot be referenced from a static context
//        Compile error

//        But if we instantiate it runs and output -> 15
        ParkRanger parkRanger = new ParkRanger();
        System.out.println(trees + parkRanger.birds);
        System.out.println(trees + parkRanger.birdsStatic);// Compile but it can be wrong in real scenario
        System.out.println(trees + ParkRanger.birdsStatic);

        // static or non-static matters
        // static member can be called from BOTH context
        // non-static field can be called from 'only non-static' context
    }

    public int nonStaticContext(){// in n.s

        ParkRanger parkRanger = new ParkRanger();

        System.out.println(     birdsStatic     );// s
        System.out.println(     birds    );// n.s

        System.out.println( this.birdsStatic );

        return birdsStatic;
    }

    public static int staticContext(){ // in s.

        ParkRanger parkRanger = new ParkRanger();
        System.out.println( parkRanger.birds );// non-static field with instantiation

//        System.out.println(birds);// non-static field without instantiation -> c.err
        System.out.println(     birdsStatic     );

//        this.birdsStatic(); // Not compile -> the keyword 'this' refers to the current instance of the class — not the class itself

//        The line this.birdsStatic(); is placed inside the static method staticContext().
//        Since static methods belong to the class itself rather than any instance of the class,
//        you cannot use 'this' within a static context.

        return birdsStatic;
    }

    public int getBirds(){
        return birds;// Non-static field 'birds' can be referenced from a non-static context
    }

    // But static field can be referenced from both
    public int getBirdsStatic(){
        return birdsStatic;
    }

    public static int getBirdsStatic2(){
        return birdsStatic;
    }
}
