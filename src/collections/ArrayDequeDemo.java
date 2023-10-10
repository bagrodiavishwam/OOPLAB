package bitsoop.collections;

import java.util.ArrayDeque;
import java.lang.RuntimeException;

public class ArrayDequeDemo {

    public static void main(String[] args) {
        ArrayDeque<String> adq = new ArrayDeque<String>();
        //System.out.println(adq.pop() + " ");
        adq.push("A");
        adq.push("B");
        adq.push("D");
        adq.push("E");
        adq.push("F");
        System.out.print("Popping the stack: ");

        while (adq.peek() != null) {
            System.out.println(adq.pop() + " ");
        }

        System.out.println();
    }
}