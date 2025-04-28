package OCA.Chapter2;

public class FinalVarAssignment {
    public static void main(String[] args) {
        int y = 10;
        final int x;// In Java, the final keyword means that a variable can only be assigned once.
        // However, this doesn't mean the variable must be assigned immediately when it's declared.
        // It just has to be assigned before it is used, and it cannot be reassigned afterward.

        OPTIONAL_LABEL:
        if(y > 5){
            x = 2 * y;
        }else if((y < 5)) {
            x = 3 * y;
        }
        else{
            x = 4; // Even it is never executed, if we comment this line --> NOT COMPILE
        }
//        x = 8 * 4;// Variable 'x' might already have been assigned to // -> c.err
        System.out.println(x);
    }
}
