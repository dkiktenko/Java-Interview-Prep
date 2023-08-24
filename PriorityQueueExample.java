import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorityQueueExample {

    public static void main(String[] args) {

        // declared, not initialized
        PriorityQueue<Integer> queue;
        // previously declared, initialized to an empty priority queue - natural order
        queue = new PriorityQueue<>();
        // initialized to an empty priority queue where a Comparator is specified
        queue = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer integer, Integer t1) {
                return t1-integer; // descending order, equivalent to Comparator.reverseOrder()
            }
        });

        // add items to the queue
        queue.add(2); // O(log(n))
        queue.add(-5);
        queue.add(10);
        queue.offer(1); // same as add
        queue.offer(5);
        queue.add(-1);

        // print to console contents of the queue (they are NOT ordered)
        System.out.println(queue); // [10, 5, 2, -5, 1, -1]

        // print to console the size of the queue (i.e. # of items within the queue) - O(1)
        System.out.println(queue.size()); // 6

        // print to console if the queue is empty or not - O(1)
        System.out.println(queue.isEmpty()); // false

        // print to console the head of the queue (highest # based on Comparator) - does NOT remove
        // item from queue. Will throw exception if queue is empty - O(1)
        System.out.println(queue.element()); // 10

        // print to console the head of the queue (highest # based on Comparator) - removes item
        // from queue. Will throw exception if queue is empty - O(log(n))
        System.out.println(queue.remove()); // 10

        // print to console the head of the queue (highest # based on Comparator) - does NOT remove
        // item from queue. Will NOT throw exception if queue is empty, just null (similar to element())
        // O(1) time complexity
        System.out.println(queue.peek()); // 5

        // print to console the head of the queue (highest # based on Comparator) - removes item
        // from queue. Will NOW throw exception if queue is empty, just null (similar to remove())
        // O(log(n)) time complexity
        System.out.println(queue.poll()); // 5

        // print to console next (highest) value in queue & remove it
        System.out.println(queue.poll()); // 2

        // print to console next (highest) value in queue & remove it
        System.out.println(queue.poll()); // 1

        // print to console if queue contains an item within the queue - O(n)
        System.out.println(queue.contains(-3)); // false

        // print to console success of removing an existing item within the queue - O(n)
        System.out.println(queue.remove(-1)); // true

        // clear the queue
        queue.clear();

        // print to console the size of the queue - O(1)
        System.out.println(queue.size()); // 0

        // print to console if the queue is empty or not - O(1)
        System.out.println(queue.isEmpty()); // true
    }
}
