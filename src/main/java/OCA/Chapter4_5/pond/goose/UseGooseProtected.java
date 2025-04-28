package OCA.Chapter4_5.pond.goose;

import OCA.Chapter4_5.pond.shore.Bird;

class UseGooseProtected extends Goose {

    public void nonStaticMethod(){
        // extends Goose -> add 2 invisible protected members (inherited)
        floatInWater();
        System.out.println(text);
    }
    public static void main(String[] args) {

        Goose goose = new Goose();// Invisible protected fields from superclass
        // It is also protected on its own --> visible only in subclasses but not if it is just in same package with Bird (not with Goose)

//        goose.floatInWater();// Not compile (compile if it is in the same package with Bird (not with Goose))
        System.out.println(goose.visible);// Compile

        UseGooseProtected useGoose = new UseGooseProtected();
        useGoose.floatInWater(); // This will compile

        UseGooseProtected goose2 = (UseGooseProtected) new Goose();
        goose2.floatInWater();

        Bird other2 = new UseGooseProtected();
//        other2.floatInWater(); // DOES NOT COMPILE
//        System.out.println(other2.text); // DOES NOT COMPILE
    }
}

class UseGooseProtected2  {
    public static void main(String[] args) {// same package no subclass
        // not extends Goose ->

        Goose goose = new Goose();

        // These are in the same package , why UseGooseProtected2 class cannot access Goose "invisible" protected fields, it inherited as protected from its parent?
        // In Java, protected members are accessible to subclasses and to classes within the same package.
        // However, when protected members are inherited from a parent class in a different package, they behave a bit differently.

        // Learn:  in classes that are neither subclasses of Bird nor in the same package as Bird,
        //  protected members from a different package are not accessible.

        // We can divide 2 part to protected fields of Goose:
        // 1. Inherited from Bird
        // 2. Own protected
//        goose.floatInWater();// 1. Not compile (compile if it is in the same package with Bird)
        System.out.println(goose.visible);// 2. Compile

    }
}
