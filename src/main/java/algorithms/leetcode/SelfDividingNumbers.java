package algorithms.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @link <a href="https://leetcode.com/problems/self-dividing-numbers/">https://leetcode.com/problems/self-dividing-numbers/</a>
 * @date 17.05.2023
 */
public class SelfDividingNumbers {

    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> numbers = new ArrayList<>();
        for (int i = left; i <= right; i++) {
            int number = i;
            boolean toAdd = true;
            while (number > 0) {
                int currentNumber = number % 10;
                if (currentNumber == 0 || i % currentNumber != 0) {
                    toAdd = false;
                    break;
                }
                number /= 10;
            }
            if (toAdd) {
                numbers.add(i);
            }
        }
        return numbers;
    }
}
