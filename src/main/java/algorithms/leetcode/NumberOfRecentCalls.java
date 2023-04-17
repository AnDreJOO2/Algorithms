package algorithms.leetcode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @link <a href="https://leetcode.com/problems/number-of-recent-calls/">https://leetcode.com/problems/number-of-recent-calls/</a>
 * @date 17.04.2023
 */
public class NumberOfRecentCalls {

    private static class RecentCounter {

        Queue<Integer> queue;

        public RecentCounter() {
            queue = new LinkedList<>();
        }

        public int ping(int t) {
            queue.add(t);
            while (queue.peek() < t - 3000 ) {
                queue.poll();
            }
            return queue.size();
        }
    }
}
