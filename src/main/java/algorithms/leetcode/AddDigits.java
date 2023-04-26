package algorithms.leetcode;

/**
 * @link <a href="https://leetcode.com/problems/add-digits/">https://leetcode.com/problems/add-digits/</a>
 * @date 26.04.2023
 */
public class AddDigits {
    public int addDigits(int num) {

        while (num > 9) {
            int temp = num;
            num = 0;
            while (temp > 0) {
                num += temp % 10;
                temp /= 10;
            }
        }
        return num;
    }

}
