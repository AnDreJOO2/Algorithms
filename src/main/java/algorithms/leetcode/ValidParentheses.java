package algorithms.leetcode;


import java.util.Stack;

/**
 * @link <a href="https://leetcode.com/problems/valid-parentheses/">https://leetcode.com/problems/valid-parentheses/</a>
 * @date 12.12.2022
 */
public class ValidParentheses {

    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == '(') {
                stack.push(')');
            } else if (chars[i] == '[') {
                stack.push(']');
            } else if (chars[i] == '{') {
                stack.push('}');
            } else if (stack.empty() || stack.pop() != chars[i]) {
                return false;
            }
        }
        return stack.isEmpty();
    }
}
