package algorithms.leetcode;

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
