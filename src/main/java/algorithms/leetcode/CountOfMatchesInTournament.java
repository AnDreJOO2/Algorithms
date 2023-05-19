package algorithms.leetcode;

/**
 * @link <a href="https://leetcode.com/problems/count-of-matches-in-tournament/">https://leetcode.com/problems/count-of-matches-in-tournament/</a>
 * @date 19.05.2023
 */
public class CountOfMatchesInTournament {
    public int numberOfMatches(int n) {
        int count = 0;
        while (n > 1) {
            if (n % 2 == 0) {
                count += n / 2;
                n /= 2;
            } else {
                count += n / 2;
                n = (n - 1) / 2 + 1;
            }
        }
        return count;
    }
}
