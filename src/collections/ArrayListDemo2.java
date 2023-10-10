package bitsoop.collections;

import java.util.ArrayList;
import java.util.Iterator;

/*
The ArrayList class implements the List interface.
It uses a dynamic array to store the duplicate element of different data types.
The ArrayList class maintains the insertion order.
 */

public class ArrayListDemo2 {
    public static void main(String args[]){
        ArrayList<String> list=new ArrayList<String>();//Creating arraylist
        list.add("User 1");//Adding object in arraylist
        list.add("User 2");
        list.add("User 3");
        list.add("User 4");
        list.ensureCapacity(23);
        list.trimToSize();
        //Traversing list through Iterator
        Iterator itr=list.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
        System.out.println("*******");
        /*
        Collection extends the Iterable interface.
        This means that all collections can be cycled through by use of the for-each style for loop.
         */
        for (String s : list)
            System.out.println(s);
    }
}


