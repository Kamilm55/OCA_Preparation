package Chapter1;

// OCA Practice ch1 test no_45
public class RollerSkates {
    static int wheels = 1;
    int tracks = 5;

    public static void main(String[] args) {
        RollerSkates s = new RollerSkates();
        int feet = 4, tracks = 15; // tracks is 'local' variable in 'main method'
        // INSIDE METHOD WHEN WE USE VAR, IT SEARCH FIRST IN LOCAL SCOPE

//        int feet = 4; (imagine not redeclare 'tracks' in main method) // If it would be like this ->
//        following line throws compile error ->
//        Non-static field 'tracks' cannot be referenced from a static context
        System.out.println(feet + tracks + s.wheels);
    }
}
