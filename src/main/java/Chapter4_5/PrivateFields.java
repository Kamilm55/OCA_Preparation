package Chapter4_5;

public class PrivateFields {
    private String a;
    private String b;

    public static void main(String[] args) {
        PrivateFields obj1 = new PrivateFields();
        obj1.b = "str";

        PrivateFields obj2 = new PrivateFields();
        obj2.b = "str";

        System.out.println(
                obj2.b.equals(obj1.b) // Two instances of the same class may access each other's private attributes.
        );
    }

}
