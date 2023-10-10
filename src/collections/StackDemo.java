package bitsoop.collections;

import java.util.Iterator;
import java.util.Stack;

/*
The stack is the subclass of Vector.
It implements the last-in-first-out data structure, i.e., Stack.
The stack contains all of the methods of Vector class and also provides its methods like
boolean push(),
boolean peek(),
boolean push(object o)
 */
public class StackDemo {
    public static void main(String args[]){
        Stack<String> stack = new Stack<String>();
        stack.push("User 1");
        stack.push("User 2");
        stack.push("User 3");
        stack.push("User 4");
        stack.push("User 5");
        stack.pop();
        Iterator<String> itr=stack.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
