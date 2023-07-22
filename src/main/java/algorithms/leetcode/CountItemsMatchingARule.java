package algorithms.leetcode;

import java.util.List;

/**
 * @link <a href="https://leetcode.com/problems/count-items-matching-a-rule/">https://leetcode.com/problems/count-items-matching-a-rule/</a>
 * @date 22.07.2023
 */
public class CountItemsMatchingARule {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int count = 0;
        int j = 0;
        if ("color".equals(ruleKey)) {
            j = 1;
        } else if ("name".equals(ruleKey)) {
            j = 2;
        }

        for (int i = 0; i < items.size(); i++) {
            if (items.get(i).get(j).equals(ruleValue)) {
                count++;
            }
        }
        return count;
    }
}
