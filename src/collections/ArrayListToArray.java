package bitsoop.collections;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListToArray {

    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<Integer>();

        al.add(1);
        al.add(2);
        al.add(3);
        al.add(4);

        System.out.println("Contents of al: " + al);

        Integer ia[] = new Integer[al.size()];
        int k[] = new int[al.size()];
        al.toArray(ia);

        int sum = 0;

        for (int i : ia)
            sum += i;
        System.out.println(Arrays.toString(ia));
        System.out.println("Sum is: " + sum);
    }
}
/*
Collections can store only references, not values of primitive types.
However, autoboxing makes it possible to pass values of type int to add( ) without having to
manually wrap them within an Integer.
Autoboxing significantly improves the ease with which collections can be used to store primitive values.
 */