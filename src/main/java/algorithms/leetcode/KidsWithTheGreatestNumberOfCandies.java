package algorithms.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @link <a href="https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/">https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/</a>
 * @date 17.04.2023
 */
public class KidsWithTheGreatestNumberOfCandies {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> greatestNumberOfCandies = new ArrayList<>(candies.length);
        int max = 0;
        for (int i = 0; i < candies.length; i++) {
            if (candies[i] > max) {
                max = candies[i];
            }
        }
        for (int i = 0; i < candies.length; i++) {
            if (candies[i] + extraCandies >= max) {
                greatestNumberOfCandies.add(true);
            } else {
                greatestNumberOfCandies.add(false);
            }
        }
        return greatestNumberOfCandies;
    }
}
