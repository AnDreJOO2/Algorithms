package algorithms.leetcode;

import java.util.HashSet;
import java.util.Set;

/**
 * @link <a href="https://leetcode.com/problems/distribute-candies/">https://leetcode.com/problems/distribute-candies/</a>
 * @date 07.05.2023
 */
public class DistributeCandies {
    public int distributeCandies(int[] candyType) {
        Set<Integer> candies = new HashSet<>();
        for (Integer candy : candyType) {
            if (candies.size() > candyType.length / 2) {
                return candyType.length / 2;
            }
            candies.add(candy);
        }
        return Math.min(candies.size(), candyType.length / 2);
    }
}
