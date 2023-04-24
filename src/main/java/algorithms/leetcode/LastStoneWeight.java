package algorithms.leetcode;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 * @link <a href="https://leetcode.com/problems/last-stone-weight/">https://leetcode.com/problems/last-stone-weight/</a>
 * @date 24.04.2023
 */
public class LastStoneWeight {
    public int lastStoneWeight(int[] stones) {
        Queue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());
        for (int i = 0; i < stones.length; i++) {
            queue.add(stones[i]);
        }
        while (queue.size() > 1) {
            int y = queue.poll();
            int x = queue.poll();
            queue.add(Math.abs(y - x));
        }
        return queue.poll();
    }
}
