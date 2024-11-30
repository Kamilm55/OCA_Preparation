package Chapter4_5.pond.goose;

import Chapter4_5.pond.shore.Bird;

public class Goose extends Bird {
    protected int visible;
    // Invisible fields from parent
    //    protected String text = "floating";          // inherited from parent
//    protected void floatInWater() {               // inherited from parent
//        System.out.println(text);
//    }
    public void helpGooseSwim() {
        Goose other = new Goose();
        other.floatInWater();
        System.out.println(other.text);
    }
    //
    public void helpOtherGooseSwim() {
        Bird other = new Goose();

        // Learn:  Although the object happens to be a Goose, it is stored in a Bird reference.
        //  We are not allowed to refer to members of the Bird class
        //  since we are not in the same package and Bird is not a subclass of Bird.
//
//        other.floatInWater(); // DOES NOT COMPILE (But these are allowed in Bird class)
//        System.out.println(other.text); // DOES NOT COMPILE

        Bird other2 = new Bird();

//        other.floatInWater(); // DOES NOT COMPILE  (But these are allowed in Bird class)
//        System.out.println(other.text); // DOES NOT COMPILE
    } }