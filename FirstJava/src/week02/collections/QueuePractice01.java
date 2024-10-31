package week02.collections;

import java.util.LinkedList;
import java.util.Queue;

public class QueuePractice01 {
    public static void main(String[] args) {
        // Queue
        // First In First Out (FIFO)
        // add, peek, poll(꺼내기)
        // 큐는 생성자가 없는 인터페이스라서 바로 생성할수 없다.
        Queue<Integer> intQueue = new LinkedList<>();
        intQueue.add(1);
        intQueue.add(5);
        intQueue.add(10);
        System.out.println(intQueue.toString()); // [1,5,10]

        // 1
        // 5
        // 10
        while(!intQueue.isEmpty()) {
            System.out.println(intQueue.poll());
        }

        intQueue.add(1);
        intQueue.add(2);
        intQueue.add(3);
        System.out.println("peek: "+ intQueue.peek()); // 1
        System.out.println("size: "+ intQueue.size()); // 3


    }
}
