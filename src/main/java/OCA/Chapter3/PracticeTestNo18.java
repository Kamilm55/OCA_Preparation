package OCA.Chapter3;

import java.util.ArrayList;
import java.util.List;

public class PracticeTestNo18 {


    public static void main(String[] args) {
        char[][] tictactoe = new char[3][3];
//        tictactoe[1][3] = 'X'; // Index 3 out of bounds for length 3

//        System.out.println(tictactoe[1][3]);


        String validArrayOneDimensional[];

        List<String> arr = new ArrayList<>(0);
        arr.add("0"); // no error

        System.out.println(arr.get(0));// 0
        System.out.println(arr.get(1));// java.lang.IndexOutOfBoundsException: Index 1 out of bounds for length 1

    }
}
