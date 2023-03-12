
package algorithms.leetcode;

/**
 * @link <a href="https://leetcode.com/problems/reverse-integer/">https://leetcode.com/problems/reverse-integer/</a>
 * @date 12.03.2023
 */
public class ReverseInteger {
    public int reverse(int x) {

        int reversed = 0; // variable to keep reversed number
        while (x != 0) { // keep doing while x != 0
            int lastDigit = x % 10; // last digit in input x

            // first critical condition, possible reversed x can be smaller than Integer.MIN_VALUE
            if (reversed < Integer.MIN_VALUE / 10 || (reversed == Integer.MIN_VALUE / 10 && lastDigit < Integer.MIN_VALUE % 10)) {
                return 0;
            }
            // second critical condition, possible reversed x can be bigger than Integer.MAX_VALUE
            if (reversed > Integer.MAX_VALUE / 10 || (reversed == Integer.MAX_VALUE / 10 && lastDigit > Integer.MAX_VALUE % 10)) {
                return 0;
            }

            reversed = reversed * 10 + lastDigit; // multiply reversed number * 10 + last digit to add lastDigit at the last position
            x /= 10; // divide original x to delete last digit.
        }
        return reversed; // return reversed number
    }
    // O(Log n), SC: O(1)
}
