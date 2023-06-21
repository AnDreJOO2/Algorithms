package algorithms.leetcode;

/**
 * @link <a href="https://leetcode.com/problems/goal-parser-interpretation/">https://leetcode.com/problems/goal-parser-interpretation/</a>
 * @date 21.06.2023
 */
public class GoalParserInterpretation {
    public String interpret(String command) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < command.length(); i++) {
            if (command.charAt(i) == 'G') {
                sb.append("G");
            } else if (command.charAt(i) == '(') {
                if (i + 1 < command.length() && command.charAt(i + 1) == ')') {
                    sb.append("o");
                    i++;
                } else if (i + 1 < command.length() && command.charAt(i + 1) == 'a'
                        && i + 2 < command.length() && command.charAt(i + 2) == 'l'
                        && i + 3 < command.length() && command.charAt(i + 3) == ')') {
                    sb.append("al");
                    i += 3;
                }
            }
        }
        return sb.toString();
    }
}
