package OCA.Chapter4_5.pond.goose;
import OCA.Chapter4_5.pond.shore.Bird;               // in a different package
public class Gosling extends Bird {     // extends means create subclass
    public void swim() {
        floatInWater();               // calling protected member
        System.out.println(text);     // calling protected member
    }

    public static void main(String[] args) {
        // 3 rules for protected:
        // 3rd: If the obj reference type is Parent, its protected fields only accessible in Parent class or WITHIN THE SAME PACKAGE.

        Gosling other = new Gosling();
        other.floatInWater();
        System.out.println(other.text);

        Bird other2 = new Gosling();
//        other2.floatInWater(); // DOES NOT COMPILE
//        System.out.println(other2.text); // DOES NOT COMPILE
    }

}
