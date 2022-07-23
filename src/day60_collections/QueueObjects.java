package day60_collections;

import java.util.PriorityQueue;

public class QueueObjects {
    public static void main(String[] args) {
        PriorityQueue<Integer>queue=new PriorityQueue<>();
        queue.add(2);
        queue.add(10);
        queue.add(8);
        queue.add(1);
        queue.add(1);
        System.out.println(queue);
        queue.offer(30);//same as add method
        System.out.println(queue);
        queue.offer(null);
        System.out.println(queue);
        System.out.println(new PriorityQueue<>().poll());//returns null

    }
    /*
    add()                  offer()
    remove()               poll()
    element()              peek()

    the ones on the left will cause exception if they are not use correctly
    The ones on the right will return null
     */
}
