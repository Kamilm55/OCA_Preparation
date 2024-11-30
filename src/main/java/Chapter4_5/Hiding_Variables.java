package Chapter4_5;
// Hiding variables
 class Rodent {
    protected int tailLength = 4;
    public void getRodentDetails() {
        System.out.println("[parentTail="+tailLength+"]");
    }
}
 class Mouse extends Rodent {
    protected int tailLength = 8;
    public void getMouseDetails() {
        System.out.println("[tail="+tailLength +",parentTail="+super.tailLength+"]");
    }
    public static void main(String[] args) {

    }
}
// Override
class Rodent2 {
    protected int getTailLength(){return 4;}
    public void getRodentDetails() {
        System.out.println("[parentTail="+getTailLength()+"]"); // this.getTailLength()
    }
}
class Mouse2 extends Rodent2 {
     @Override
    protected int getTailLength(){return 8;}
    public void getMouseDetails() {
        System.out.println("[tail="+getTailLength() +",parentTail="+super.getTailLength()+"]");
    }
    public static void main(String[] args) {

    }
}
// Hiding non-static methods
class Rodent3 {
    private int getTailLength(){return 4;}
    public void getRodentDetails() {
        System.out.println("[parentTail="+getTailLength()+"]");// Cannot this. -> because method of Subclass is not visible
    }
}
class Mouse3 extends Rodent3 {
    //Hide
    private int getTailLength(){return 8;}
    public void getMouseDetails() {
        System.out.println("[tail="+getTailLength() +/*",parentTail="+super.getTailLength()+*/"]");
    }
    public static void main(String[] args) {

    }
}
// Hiding static methods
class Rodent4 {
    protected static int getTailLength(){return 4;}
    public void getRodentDetails() {
        System.out.println("[parentTail="+getTailLength()+"]");
    }
}

class Mouse4 extends Rodent4 {
    protected static int getTailLength(){return 8;}
    public void getMouseDetails() {
        System.out.println("[tail="+getTailLength() +",parentTail="+super.getTailLength()+"]");
    }
    public static void main(String[] args) {

    }
}
public class Hiding_Variables  {
    public static void main(String[] args) {

        // Left side(Reference type) only checks accessibility/visibility of members

        // Hiding variables
        Mouse mouse = new Mouse();
        mouse.getRodentDetails();// 4
        mouse.getMouseDetails();// 8 4

        // Override
        Mouse2 mouse2 = new Mouse2();
        mouse2.getRodentDetails();// 8
        mouse2.getMouseDetails();// 8 4

        // Hiding non-static methods
        Mouse3 mouse3 = new Mouse3();
        mouse3.getRodentDetails();// 4
        mouse3.getMouseDetails();// 8

        // Hiding static methods
        Mouse4 mouse4 = new Mouse4();
        mouse4.getRodentDetails();// 4
        mouse4.getMouseDetails();// 8 4

//        Note: default access (package-private) fields can be inherited in Java,
//        but they are only accessible within the same package
    }
}
