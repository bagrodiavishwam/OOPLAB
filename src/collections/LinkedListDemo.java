package bitsoop.collections;

import java.util.LinkedList;

public class LinkedListDemo {

    public static void main(String[] args) {
        LinkedList<String> ll = new LinkedList<String>();
        LinkedList<String> l1 = new LinkedList<String>();

        System.out.println(ll.getFirst());
        System.out.println(ll.peekFirst());
        System.out.println(ll.peekLast());
        ll.add("F");
        ll.add("B");
        ll.add("D");
        ll.add("E");
        ll.add("C");
        ll.addLast("Z");
        ll.addFirst("A");
        System.out.println("Contents of ll: " + ll);
        System.out.println("First --> "+ ll.getFirst());
        System.out.println("First --> "+ ll.getLast());
        ll.add(1, "A2");

        System.out.println("Final contents of ll: " + ll);

        ll.remove("F");
        ll.remove(2);

        System.out.println("Contents of ll after deletion: " + ll);

        ll.removeFirst();
        ll.removeLast();

        System.out.println("ll after deleting first and last: " + ll);

        String val = ll.get(2);
        ll.set(2, val + " Changed");

        System.out.println("ll after change: " + ll);
    }
}