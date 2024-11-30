package Chapter1.Practice;
//Ch 1, test 21
public class Tolls {
    private static  int yesterday = 1;
//    private int yesterday; // Variable 'yesterday' is already defined in the scope -> as the static variable
    int tomorrow = 10;

    public static void main(String[] args) {
        Tolls tolls = new Tolls();
//        tomorrow = 20; // we cannot call instance var without the instance of class
//        tolls.tomorrow = 20;
//        yesterday = 10;
//        int yesterday = 29;// -> valid -> (shadowing) --> redeclare static var (even the previous variable scope is visible, we are able to redeclare it)

        int today = 20, tomorrow = 40;// can be declared as local variable (tomorrow)
        System.out.println(today + tolls.tomorrow + tolls.yesterday);// 31 = 20 + 10 + 1

        int t = tomorrow + tolls.tomorrow;// local(40) vs instance(10)
    }
}
