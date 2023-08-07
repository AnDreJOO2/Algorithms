package algorithms.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @link <a href="https://leetcode.com/problems/split-strings-by-separator/">https://leetcode.com/problems/split-strings-by-separator/</a>
 * @date 07.08.2023
 */
public class SplitStringsBySeparator {

    public List<String> splitWordsBySeparator(List<String> words, char separator) {
        List<String> list = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        for (String word : words) {
            for (char ch : word.toCharArray()) {
                if (ch == separator) {
                    if (!sb.isEmpty()) {
                        list.add(sb.toString());
                        sb.setLength(0);
                    }
                } else {
                    sb.append(ch);
                }
            }
            if (!sb.isEmpty()) {
                list.add(sb.toString());
                sb.setLength(0);
            }
        }
        return list;
    }
}
