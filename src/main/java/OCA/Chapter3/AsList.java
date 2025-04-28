package OCA.Chapter3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

// Review_24
public class AsList {
    public static void main(String[] args) {
        String []names = {"Tom","Dick","Harry"};

//        List<String> list = names.asList();// not compile
        List<String> list = Arrays.asList(names);// return backed list
        // Fixed Size: The size of the list is determined by the array size at the time of creation.
        // You cannot add or remove elements from this list;
        // attempting to do so will throw an UnsupportedOperationException.
        //  Mutability of Elements: While the list itself is fixed in size,
        //  you can modify the elements in the list.
        //  For example, if you change an element in the list,
        //  the corresponding element in the original array will also change

        list.set(0,"Sue");
        System.out.println(names[0]);// Sue


        System.out.println(names[1]);// Dick
        System.out.println(list.get(1));// Dick

        names[1] = "New";
        System.out.println(names[1]);// New
        System.out.println(list.get(1));// New

        Arrays.sort(names);// primitive
//        Arrays.sort(list);// not compile
        Arrays.sort(list.toArray());

//        Collections.sort(names);// primitive -> // not compile
        Collections.sort(list);// Wrapper
        Collections.sort(Arrays.asList(names));
        Collections.sort(List.of(names));
        // List.of:
//        Usage: Creates an immutable list directly from provided elements.
//        Mutability: The list is immutable;
//        you cannot modify, add, or remove elements after the list is created.

    }
}
