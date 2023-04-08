package algorithms.leetcode;

/**
 * @link <a href="https://leetcode.com/problems/guess-number-higher-or-lower/">https://leetcode.com/problems/guess-number-higher-or-lower/</a>
 * @date 08.04.2023
 */
public class GuessNumberHigherOrLower {

    // api
    private int guess(int num) {
        return 0;
    }

    public int guessNumber(int n) {
        int start = 1;
        int end = n;
        while (start <= end) {
            n = start + (end - start) / 2;
            if (guess(n) == 0) {
                return n;
            } else if (guess(n) == -1) {
                end = n - 1;
            } else {
                start = n + 1;
            }
        }
        return 0;
    }
}
