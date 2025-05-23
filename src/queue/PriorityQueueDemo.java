package queue;

import java.util.Iterator;
import java.util.PriorityQueue;
public class PriorityQueueDemo {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        pq.offer(10);
        pq.offer(1);
        pq.offer(5);
        pq.offer(-1);

        for(int val : pq){
            System.out.println(val);
        }
        System.out.println();

        Iterator i = pq.iterator();
        while (i.hasNext()){
            System.out.println(i.next());
        }
    }
}
