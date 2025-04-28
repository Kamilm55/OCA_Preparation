package OCA.Chapter4_5.Practice;
// Ch_7 -> 16
class Ship {
    protected int weight = 3;
    private int height = 5;// private
    public int getWeight() {return weight;}
    public int getHeight() {return height;}

    protected static int staticWeight = 3;
    private static int staticHeight = 3;
}
public class Rocket extends Ship{
    public int weight = 3;
    public int height = 5;

    public void printDetails() {
//        System.out.println(super.getWeight() + "," + super.height );// super.height -> not compile -> private

        System.out.println(super.weight); // we can print weight of parent
    }


    public static void main(String[] args) {
        new Rocket().printDetails();

//        System.out.println(super.weight);// n.s variable cannot be called from static

//        System.out.println(super.staticWeight); // because super. cannot be used in a static context -> even it is static
//        System.out.println(this.height); // not compile -> this. cannot be called from static

        System.out.println(staticWeight);// inherited protected
//        System.out.println(staticHeight);// not compile -> not inherited private


        // new Rocket() without introducing variable to this - What would be Reference Rocket or Ship? -> Rocket
        // Rocket defaultInstanceReference = new Rocket();
    }
}
