package OCA.Chapter3;

import java.util.ArrayList;
import java.util.List;

public class ArrayStoreEx {
    public static void main(String[] args) {
        // Note:
          int[] arr = {1, 2, 3};

//         Arrays are objects, so we can assign it to an Object reference
          Object obj = arr;

          System.out.println(obj instanceof int[]); // true

        String[] str = {"ss"};
        Object[] obs = str;
        String[] againStr = (String[]) obs;

//        againStr[0] = new StringBuilder("ssad") // NOT COMPILE
        obs[0] = new StringBuilder("ssad");// Compile, but throw exception at runtime
        // java.lang.StringBuilder
        //	at Chapter3.ArrayStoreEx.main(ArrayStoreEx.java:10)

        int[][] nums = new int[3][2];
        System.out.println(nums[1][1]);// 0
        String[][] strs = new String[3][2];
        System.out.println(strs[1][1]);// null

    }
}
