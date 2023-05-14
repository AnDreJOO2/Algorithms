package algorithms.leetcode;

import java.util.HashSet;
import java.util.Set;

/**
 * @link <a href="https://leetcode.com/problems/find-center-of-star-graph/">https://leetcode.com/problems/find-center-of-star-graph/</a>
 * @date 14.05.2023
 */
public class FindCenterOfStarGraph {
    public int findCenter(int[][] edges) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < edges.length; i++) {
            for (int j = 0; j < edges[i].length; j++) {
                if (set.contains(edges[i][j])) {
                    return edges[i][j];
                }
                set.add(edges[i][j]);
            }
        }
        return -1;
    }
}
