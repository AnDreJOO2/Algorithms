package algorithms.leetcode;

/**
 * @link <a href="https://leetcode.com/problems/find-the-highest-altitude/">https://leetcode.com/problems/find-the-highest-altitude/</a>
 * @date 19.06.2023
 */
public class FindTheHighestAltitude {

    public int largestAltitude(int[] gain) {
        int highestAltitude = 0;
        int currentAltitude = 0;
        for (int i = 0; i < gain.length; i++) {
            currentAltitude += gain[i];
            if (currentAltitude > highestAltitude) {
                highestAltitude = currentAltitude;
            }
        }
        return highestAltitude;
    }
}
