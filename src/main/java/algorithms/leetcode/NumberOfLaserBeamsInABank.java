package algorithms.leetcode;

/**
 * @link <a href="https://leetcode.com/problems/number-of-laser-beams-in-a-bank/">https://leetcode.com/problems/number-of-laser-beams-in-a-bank/</a>
 * @date 09.07.2023
 */
public class NumberOfLaserBeamsInABank {
    public int numberOfBeams(String[] bank) {
        int sum = 0;
        int previousBeams = 0;
        for (int i = 0; i < bank.length; i++) {
            int currentBeams = 0;
            for (char ch : bank[i].toCharArray()) {
                if (ch == '1') {
                    currentBeams++;
                }
            }
            if (previousBeams == 0 && currentBeams != 0) {
                previousBeams = currentBeams;
            } else if (currentBeams != 0) {
                sum += previousBeams * currentBeams;
                previousBeams = currentBeams;
            }
        }
        return sum;
    }
}
