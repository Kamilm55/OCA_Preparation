package Chapter4_5.Practice;
// Ch_6 -> 47
public class Football {
    public static void main(String[] args) {
        final int startTime = 4;
        System.out.println(getScore(startTime));
    }

//    public static Long getScore(Long timeRemaining) { // Any subclass of Long or long (from primitives) can compile
//        return  2 * timeRemaining;
//    }
    public static Long getScore(long timeRemaining) { // it compiles
        return  2 * timeRemaining;
    }
//    private static int getScore(int timeRemaining) { // It compiles
//        return  2 * timeRemaining;
//    }

    // For return type
//    public static Long getScore2(int timeRemaining) { // NOT COMPILE
//        return  2 * timeRemaining; // promoted to int -> it auto can convert to only Integer (autobox) or
////        can widen to larger primitive data such as double,long,float
//    }
    public static float getScore3(int timeRemaining) { // COMPILE
        return  2 * timeRemaining;
    }
}
