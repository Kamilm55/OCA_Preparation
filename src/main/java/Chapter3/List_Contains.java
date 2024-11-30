package Chapter3;

import java.util.ArrayList;
import java.util.List;

public class List_Contains {
    public static void main(String[] args) {
        /*
        * @apiNote
 * {@code StringBuilder} implements {@code Comparable} but does not override
 * {@link Object#equals equals}. Thus, the natural ordering of {@code StringBuilder}
 * is inconsistent with equals.
                */
        List list = new ArrayList<>();
        list.add(1);
//        list.add("str");
        list.add(new String("str"));
        list.add(new StringBuilder("str"));
        list.add(new StringBuilder("str"));

        System.out.println(list.contains("str"));// true
        System.out.println(list.contains(new String("str")));// true
        System.out.println(list.contains(new StringBuilder("str")));// false
        // StringBuilder does not impl equals() ->  the default implementation of equals() from the Object class,
        // which checks for reference equality (i.e., whether two references point to the exact same object in memory).

        System.out.println();

        Object searchedElement1 = new String("str");
        Object searchedElement2 = new StringBuilder("str");

        // contains() calls equals on each element
        boolean stringElement = customContains(list, searchedElement1);
        boolean sbElement = customContains(list, searchedElement2);

        System.out.println(stringElement);// true
        System.out.println(sbElement);// false
    }

    private static boolean customContains(List list, Object searchedElement1) {
        for (Object obj : list) {
            if (obj.equals(searchedElement1)) {
                return true;
            }
        }
        return false;
    }

}
