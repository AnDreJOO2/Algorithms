package algorithms.leetcode;

/**
 * @link <a href="https://leetcode.com/problems/lemonade-change/">https://leetcode.com/problems/lemonade-change/</a>
 * @date 06.08.2023
 */
public class LemonadeChange {
    public boolean lemonadeChange(int[] bills) {
        int fives = 0;
        int tens = 0;
        for (int b : bills) {
            if (b == 5) {
                fives++;
                continue;
            } else if (b == 10 && fives > 0) {
                fives--;
                tens++;
                continue;
            } else if (b == 20) {
                if (tens > 0 && fives > 0) {
                    tens--;
                    fives--;
                    continue;
                } else if (fives > 2) {
                    fives -= 3;
                    continue;
                }
                return false;
            }
            return false;
        }
        return true;
    }
}
