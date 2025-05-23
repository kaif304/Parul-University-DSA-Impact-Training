package queue;

import java.util.*;

public class LinkedListQueueImplementation {
    public static void main(String[] args) {
        Queue<String> q = new LinkedList<>();

        q.offer("java");
        q.offer("c++");
        q.offer("python");

        Iterator<String> i = q.iterator();

        while(i.hasNext()){
            System.out.println(i.next());
        }
    }
}
