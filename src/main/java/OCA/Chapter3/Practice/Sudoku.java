package OCA.Chapter3.Practice;

import java.util.Arrays;

// Ch10_14
public class Sudoku {
    //int[] , int[][] or any array is object, behaves like reference type
//    static int[][] game; // Not init -> class field as Reference type is null by default

    // Scenario 2 -> initialize correctly
    static int[][] game = new int[9][9];

    public static void main(String[] args) {
//        int[][] game; // if it would exist instead of class variable -> NOT COMPILE --> Must be initialized
        game[3][3] = 6;//  Cannot load from object array because "Sudoku.game" is null

        Object[] obj = game;// int[] -> obj , int[] [] -> can be object array
//        obj[3] = new Object();// Even if we assign object(no c.err) -> ArrayStoreException(runtime) -> actual value is int[]
        obj[3] = new int[10];// valid
        obj[4] = new int[]{10, 45};// valid
//        obj[6] = "s"; // ex but at runtime
//        game[3][2] = "s"; // ex at compile time

        System.out.println(Arrays.toString(obj)); // Array is mutable, game and obj indicates to the same array
        System.out.println(Arrays.toString(game));
        System.out.println(Arrays.toString(game[3]));
        System.out.println(Arrays.toString(game[4]));

        System.out.println(game[3][3]);


    }
}
