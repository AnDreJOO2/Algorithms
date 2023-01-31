package algorithms.leetcode;

/**
 * @link <a href="https://leetcode.com/problems/first-bad-version/">https://leetcode.com/problems/first-bad-version/</a>
 * @date 31.01.2022
 */
public class FirstBadVersion {
    public int firstBadVersion(int n) {

        int left = 0;
        int right = n;

        while(left<right){
            int middle = left + (right-left)/2;
// works
//            if(isBadVersion(middle)){
//                right=middle;
//            }
//            else{
//                left = middle + 1;
//            }
        }
        return left;

    }
}
