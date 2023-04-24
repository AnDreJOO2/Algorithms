package algorithms.leetcode;

/**
 * @link <a href="https://leetcode.com/problems/capitalize-the-title/">https://leetcode.com/problems/capitalize-the-title/</a>
 * @date 24.04.2023
 */
public class CapitalizeTheTitle {
    public String capitalizeTitle(String title) {
        String[] strings = title.split(" ");
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < strings.length; i++) {
            for (int j = 0; j < strings[i].length(); j++) {
                if (strings[i].length() > 2 && j == 0) {
                    sb.append(Character.toUpperCase(strings[i].charAt(j)));
                } else {
                    sb.append(Character.toLowerCase(strings[i].charAt(j)));
                }
            }
            sb.append(" ");
        }
        sb.deleteCharAt(sb.length() - 1);
        return sb.toString();
    }
}
