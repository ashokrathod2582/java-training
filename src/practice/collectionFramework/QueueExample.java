package practice.collectionFramework;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {

    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();

        //adding elements
        queue.add("Apple");
        queue.add("Banana");
        queue.add("Orange");

        System.out.println("Queue: "+queue);

        //Accessing front element of the queue
        String frontElement = queue.peek();
        System.out.println("Front Element: "+frontElement);

        //Removing the front element from the queue
        String removeElement = queue.poll();
        System.out.println("Remove element: "+removeElement);

        queue.add("Grapes");
        System.out.println("Updated Queue: "+queue);

        System.out.println("Size of the queue: "+queue.size());
    }
}
