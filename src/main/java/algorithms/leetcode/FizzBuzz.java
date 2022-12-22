package algorithms.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @link <a href="https://leetcode.com/problems/fizz-buzz/">https://leetcode.com/problems/fizz-buzz/</a>
 * @date 22.12.2022
 */
public class FizzBuzz {

    public List<String> fizzBuzz(int n) {
        List<String> strings = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                strings.add("FizzBuzz");
                continue;
            } else if (i % 3 == 0) {
                strings.add("Fizz");
                continue;
            } else if (i % 5 == 0) {
                strings.add("Buzz");
                continue;
            }
            strings.add(String.valueOf(i));
        }
        return strings;
    }

}
