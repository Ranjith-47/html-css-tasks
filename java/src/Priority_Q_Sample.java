import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;
public class Priority_Q_Sample {
    public static void main(String[] args) {
        ArrayDeque<Integer> queue = new ArrayDeque<>();
//        queue.offer(10);
//        queue.offer(20);
//        queue.offer(30);
//        queue.offer(40);
// Offer is time efficient O(log N) add -> O(N)
        queue.add(10);
        queue.add(20);
        queue.add(30);
        queue.add(40);
        System.out.println(queue);

    }

}
