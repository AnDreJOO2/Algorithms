package algorithms.leetcode;

/**
 * @link <a href="https://leetcode.com/problems/arranging-coins/">https://leetcode.com/problems/arranging-coins/</a>
 * @date 26.01.2023
 */
public class ArrangingCoins {

    public int arrangeCoins(int n) {
        int value = n;
        for (int i = 1; i <=n; i++) {
            if(value<i){
                return i-1;
            }
            value-=i;
        }
        return 1;
    }

}
