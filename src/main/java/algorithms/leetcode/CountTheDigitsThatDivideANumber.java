package algorithms.leetcode;

/**
 * @link <a href="https://leetcode.com/problems/count-the-digits-that-divide-a-number/">https://leetcode.com/problems/count-the-digits-that-divide-a-number/</a>
 * @date 06.05.2023
 */
public class CountTheDigitsThatDivideANumber {
    public int countDigits(int num) {
        int count = 0;
        int temp = num;
        while (num > 9) {
            int lastDigit = num % 10;
            if (temp % lastDigit == 0) {
                count++;
            }
            num /= 10;
        }
        if (temp % num == 0) {
            count++;
        }
        return count;
    }
}
