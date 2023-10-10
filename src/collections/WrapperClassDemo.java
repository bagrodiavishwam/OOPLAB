package bitsoop.collections;

import java.util.ArrayList;

public class WrapperClassDemo {

    public static void main(String[] args)
    {
        //Auto-boxing
        /*
        Autoboxing: Automatic conversion of primitive types to the object of their corresponding
        wrapper classes is known as autoboxing.
        For example – conversion of int to Integer, long to Long, double to Double etc.
         */
        char ch = 'a';
        Character a = ch;
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        arrayList.add(25);
        System.out.println(ch);
        System.out.println(a);
        System.out.println(arrayList.get(0));

        /*
        Unboxing: It is just the reverse process of autoboxing.
        Automatically converting an object of a wrapper class to its corresponding primitive type
        is known as unboxing.
        For example – conversion of Integer to int, Long to long, Double to double, etc.
         */
        Character ch1 = 'a';

        // unboxing - Character object to primitive conversion
        char a1 = ch1;

        ArrayList<Integer> arrayList1 = new ArrayList<Integer>();
        arrayList1.add(24);

        // unboxing because get method returns an Integer object
        int num = arrayList1.get(0);

        // printing the values from primitive data types
        System.out.println(num);
    }

}
