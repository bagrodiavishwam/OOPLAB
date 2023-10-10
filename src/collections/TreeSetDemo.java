package bitsoop.collections;

import java.util.TreeSet;

public class TreeSetDemo {

    public static void main(String[] args) {
        TreeSet<String> ts = new TreeSet<String>();

        ts.add("C");
        ts.add("A");
        ts.add("B");
        ts.add("E");
        ts.add("F");
        ts.add("D");
        System.out.println(ts);
        System.out.println(ts.subSet("C", "F"));
    }
}
/*
TreeSet stores its elements in a tree, they are automatically arranged in sorted order.
Because TreeSet implements the NavigableSet interface, we can use the methods defined by NavigableSet to retrieve elements of a TreeSet.
eg - subSet( ) to obtain a subset of ts that contains the elements between C (inclusive) and F (exclusive).
 */