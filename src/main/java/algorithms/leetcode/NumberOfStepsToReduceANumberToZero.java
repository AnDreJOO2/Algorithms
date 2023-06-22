package algorithms.leetcode;

/**
 * @link <a href="https://leetcode.com/problems/number-of-steps-to-reduce-a-number-to-zero/">https://leetcode.com/problems/number-of-steps-to-reduce-a-number-to-zero/</a>
 * @date 23.06.2023
 */
public class NumberOfStepsToReduceANumberToZero {
    public int numberOfSteps(int num) {
        if (num < 1) {
            return 0;
        }
        int steps = 1;
        while (num != 1) {
            if (num % 2 == 0) {
                num /= 2;
            } else {
                num -= 1;
            }
            steps++;
        }
        return steps;
    }
}
