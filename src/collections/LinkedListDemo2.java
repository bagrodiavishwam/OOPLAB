package bitsoop.collections;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo2 {
    public static void main(String args[]){

        LinkedList<String> linkedList = new LinkedList<String>();

        linkedList.add("User 1");//Adding object in linkedlist
        linkedList.add("User 2");
        linkedList.add("User 3");
        linkedList.add("User 4");

        Iterator<String> itr=linkedList.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
        System.out.println("********");
        for (String s : linkedList)
            System.out.println(s);
    }
}

