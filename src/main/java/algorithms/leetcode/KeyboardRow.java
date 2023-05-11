package algorithms.leetcode;

/**
 * @link <a href="https://leetcode.com/problems/keyboard-row/">https://leetcode.com/problems/keyboard-row/</a>
 * @date 11.05.2023
 */
public class KeyboardRow {
    public String[] findWords(String[] words) {
        String firstRow = "qwertyuiop";
        String secondRow = "asdfghjkl";
        String thirdRow = "zxcvbnm";
        StringBuilder sb = new StringBuilder();
        for (String word : words) {
            char[] chars = word.toLowerCase().toCharArray();
            for (int i = 0; i < chars.length; i++) {
                if (!firstRow.contains(String.valueOf(chars[i]))) {
                    break;
                }
                if (i == chars.length - 1) {
                    sb.append(word);
                    sb.append(" ");
                }
            }

            for (int i = 0; i < chars.length; i++) {
                if (!secondRow.contains(String.valueOf(chars[i]))) {
                    break;
                }
                if (i == chars.length - 1) {
                    sb.append(word);
                    sb.append(" ");
                }
            }

            for (int i = 0; i < chars.length; i++) {
                if (!thirdRow.contains(String.valueOf(chars[i]))) {
                    break;
                }
                if (i == chars.length - 1) {
                    sb.append(word);
                    sb.append(" ");
                }
            }
        }
        return sb.length() > 1 ? sb.toString().split(" ") : new String[]{};
    }
}
