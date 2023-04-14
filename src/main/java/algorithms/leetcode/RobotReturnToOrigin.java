package algorithms.leetcode;

/**
 * @link <a href="https://leetcode.com/problems/robot-return-to-origin/">https://leetcode.com/problems/robot-return-to-origin/</a>
 * @date 14.04.2023
 */
public class RobotReturnToOrigin {

    public boolean judgeCircle(String moves) {

        int x = 0;
        int y = 0;
        for (char ch : moves.toCharArray()) {
            if (ch == 'L') {
                x--;
            } else if (ch == 'R') {
                x++;
            } else if (ch == 'U') {
                y++;
            } else if (ch == 'D') {
                y--;
            }
        }
        return x == 0 && y == 0;
    }
}
