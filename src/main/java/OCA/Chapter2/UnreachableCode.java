package OCA.Chapter2;

public class UnreachableCode {
    private static int hourOfDay;// class var
    public static void main(String[] args) {

        if(hourOfDay < 15) {
            System.out.println("G A");
        } else if (hourOfDay < 11) {// Unreachable but compiles
            System.out.println("G M");
        }else {
            System.out.println("G E");
        }
    }
}
