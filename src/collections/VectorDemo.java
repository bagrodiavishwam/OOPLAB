package bitsoop.collections;

import java.util.Iterator;
import java.util.Vector;

/*
Vector uses a dynamic array to store the data elements.
It is similar to ArrayList.
It contains many methods that are not the part of Collection framework.
 */
public class VectorDemo {
    public static void main(String args[]){
        Vector<String> vector = new Vector<String>();
        vector.add("User 1");//Adding object in Vector
        vector.add("User 2");
        vector.add("User 3");
        vector.add("User 4");
        Iterator<String> itr = vector.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
