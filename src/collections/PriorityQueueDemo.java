package bitsoop.collections;

import java.util.Iterator;
import java.util.PriorityQueue;

/*
Queue interface maintains the first-in-first-out order.
There are various classes like PriorityQueue, Deque, and ArrayDeque which implements the Queue interface.

The PriorityQueue class implements the Queue interface.
PriorityQueue doesn't allow null values to be stored in the queue.
 */
public class PriorityQueueDemo {
    public static int main(String args[]){
        PriorityQueue<String> queue=new PriorityQueue<String>();
        queue.add("User 1");
        queue.add("User 2");
        queue.add("User 3");
        queue.add("User 4");
        System.out.println("head:"+queue.element());
        System.out.println("head:"+queue.peek());
        System.out.println("iterating the queue elements:");
        Iterator itr=queue.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
        queue.remove();
        queue.poll();
        System.out.println("after removing two elements:");
        Iterator<String> itr2=queue.iterator();
        while(itr2.hasNext()){
            System.out.println(itr2.next());
        }
        return 1;
    }

}
