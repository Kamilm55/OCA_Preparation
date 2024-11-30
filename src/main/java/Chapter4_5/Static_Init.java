package Chapter4_5;

public class Static_Init {
//    private static  final  int two; // NOT COMPILE --> Only can be init in static init or same line
    private  static final int four;

    static {
        four = 5;
    }

    public Static_Init(){
        // Static fields are available, even if it is not instantiated yet
//        two = 45; // valid,but not resolve c.e;
        // Static init is the only place available without instance of Class
        // it executes when the class is first used
    }
    public static void main(String[] args) {

    }
}
