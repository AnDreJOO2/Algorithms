package algorithms.leetcode;

/**
 * @link <a href="https://leetcode.com/problems/water-bottles/">https://leetcode.com/problems/water-bottles/</a>
 * @date 10.05.2023
 */
public class WaterBottles {
    public int numWaterBottles(int numBottles, int numExchange) {
        int max = numBottles;
        while (numBottles >= numExchange) {
            if (numBottles % numExchange == 0) {
                max += numBottles / numExchange;
                numBottles = numBottles / numExchange;
            } else {
                int toAdd = numBottles / numExchange;
                max += toAdd;
                numBottles = numBottles % numExchange + toAdd;
            }
        }
        return max;
    }

}
