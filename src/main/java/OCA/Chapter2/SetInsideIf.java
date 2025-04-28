package OCA.Chapter2;

public class SetInsideIf {
    public static void main(String[] args) {
//        int x = 1;
//        if (x = 5){// = -> assign x to 5 ---> return int (x -> 5) -> NOT COMPILE
//            System.out.println("X is 5");
//        }

        //

        boolean b = false;

        if (b == true){// == -> equality
            System.out.println("TRUE");
        }else {
            System.out.println("FALSE");
        }
        System.out.println("vs");
        if (b = true){// = -> assign b to true ---> return boolean (b - true)
            System.out.println("TRUE");
        }else {
            System.out.println("FALSE");
        }

    }
}
