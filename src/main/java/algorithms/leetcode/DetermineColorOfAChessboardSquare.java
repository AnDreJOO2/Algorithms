package algorithms.leetcode;

/**
 * @link <a href="https://leetcode.com/problems/determine-color-of-a-chessboard-square/">https://leetcode.com/problems/determine-color-of-a-chessboard-square/</a>
 * @date 18.05.2023
 */
public class DetermineColorOfAChessboardSquare {
    public boolean squareIsWhite(String coordinates) {
        char[] chars = coordinates.toCharArray();
        if (chars[0] % 2 != 0 && chars[1] % 2 != 0) {
            return false;
        } else if (chars[0] % 2 == 0 && chars[1] % 2 == 0) {
            return false;
        }
        return true;
    }
}
