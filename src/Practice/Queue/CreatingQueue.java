package Practice.Queue;

import java.util.*;

public class CreatingQueue
{
    public static void main(String[] args) {
        Queue<Integer> queue=new ArrayDeque<>();
        Deque<Integer> deque=new ArrayDeque<>();

        queue.offer(1);
        queue.offer(2);
        queue.offer(3);

        System.out.println(123);
        System.out.println("vars");
        System.out.println(new int[] {1,2,3,4,5});

        System.out.println(queue.poll());
        System.out.println(queue.peek());
        System.out.println(queue.size());

        queue.isEmpty();

    }
}
