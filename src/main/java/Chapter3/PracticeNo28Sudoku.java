package Chapter3;

import java.util.Arrays;

public class PracticeNo28Sudoku {
    static int[][] game = new int[6][6];

     static public void main(String[] args) {
        game[3][3] = 6;

//        game[0][0] = "5";// Compile error -> Required type:int Provided:String ->  The compiler can protect us
        System.out.println(Arrays.deepToString(game));

//        Object[][] obj = game; not compile
        Object[] obj = game;// Compiles, cast to Object, DANGEROUS BUT LEGAL, IT CAN SET MORE GENERIC TYPE,
        // NOW WE CAN STORE OTHER TYPE THAT IS NOT AN INT WHICH CAUSE TO EXCEPTION
//        obj[0][0] = 5;// Compile error -> array required, but java.lang.Object found. It is ONE dimensional Object array
//        obj[0] = 5;// java.lang.ArrayStoreException: java.lang.Integer
//        obj[0] = Integer.valueOf(5);// java.lang.ArrayStoreException: java.lang.Integer
          obj[3] = "X";// Runtime exception, no compile error -> ArrayStoreException: java.lang.String -> The compiler can't protect us

        obj[0] = new int[]{5, 6, 8};// WORKS


        // HOW CAST WORKS? -> game is an int[][], which is an array of int[].
        // Object[] means -> array of Object, int[][] means -> array of int[](which can be considered as Object type)
        // int[] = Object , for example:
        int[] sampleArr = new int[10];
        Object copyOfArr = sampleArr; // WORKS

        System.out.println(Arrays.deepToString(obj));// for checking

        int num = 5;
        Object castToObj = num;

        System.out.println(game[3][3]);

    }
}
