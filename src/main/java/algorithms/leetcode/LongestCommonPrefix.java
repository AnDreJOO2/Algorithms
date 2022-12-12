package algorithms.leetcode;

/**
 * @link <a href="https://leetcode.com/problems/longest-common-prefix/">https://leetcode.com/problems/longest-common-prefix/</a>
 * @date 12.12.2022
 */
public class LongestCommonPrefix {

    //slower
    public String longestCommonPrefixOne(String[] strs) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < strs[0].length(); i++) {
            sb.append(strs[0].charAt(i));
            for (int j = 1; j < strs.length; j++) {

                if (!strs[j].startsWith(sb.toString())) {
                    return sb.deleteCharAt(sb.length() - 1).toString();
                }
            }

        }
        return sb.toString();
    }

    //faster
    public String longestCommonPrefixTwo(String[] strs) {

        if (strs.length == 0) {
            return "";
        }
        String prefix = strs[0];
        for (int i = 0; i < strs.length; i++) {
            while (!strs[i].startsWith(prefix)) {
                prefix = prefix.substring(0, prefix.length() - 1);
            }
        }
        return prefix;
    }

}
