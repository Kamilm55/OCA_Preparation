package OCA.Chapter4_5;

import java.util.function.Predicate;

public class CallingConstructorInsideOther {
    private int field = 5;
    public CallingConstructorInsideOther(){
        // Receive created obj with new keyword (where it is called from)
        new CallingConstructorInsideOther(3);// Compiles but not what we want ->
        // ignore obj that created and sent to this method --> create other obj, but we cannot access this obj

        // For clear explanation
        CallingConstructorInsideOther ignored = new CallingConstructorInsideOther(3);
        System.out.println("Value of ignored: " + ignored.field);
        System.out.println(
                "It actually sets the value," +
                "but we cannot access this obj from outside the constructor " +
                "because of locally scoped"
        );

        //
    }
    public CallingConstructorInsideOther(String str){
        // Receive created obj with new keyword (where it is called from)
        this(3);// send this created obj to CallingConstructorInsideOther(int num) --> without creating new instance

//        CallingConstructorInsideOther(3);// NOT COMPILE
    }

    public CallingConstructorInsideOther(int num){
        this.field = num;
    }

    public static void main(String[] args) {
        CallingConstructorInsideOther nonParam = new CallingConstructorInsideOther();
        // Creates obj with this new and sen this obj to Constructor

        System.out.println("Wrong approach: " + nonParam.field);// 5

        CallingConstructorInsideOther s = new CallingConstructorInsideOther("");
        System.out.println("True approach: " + s.field);// 3

//        Predicate<Integer> predicate = a -> {return a + 2;};// Not compile - should return boolean
        Predicate<Integer> predicate = a ->  a.equals(2);

    }
}
