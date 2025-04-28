package OCA.Chapter2;

public class Unreachable_Code {
    public static void main(String[] args) {
        int hour = (int) (Math.random()*10);

        if (hour >= 5){
            System.out.println();
        } else if (hour >0) {// UNREACHABLE, BUT COMPILES AND NO EXCEPTION
            System.out.println("This never occurs");
        }else {
            System.out.println("Smaller than 5");
        }
    }
}
