package algorithms.leetcode;

/**
 * @link <a href="https://leetcode.com/problems/container-with-most-water/">https://leetcode.com/problems/container-with-most-water/</a>
 * @date 22.03.2023
 */
public class ContainerWithMostWater {
    public int maxArea(int[] height) {

        int maxArea = 0;
        int leftPointer = 0;
        int rightPointer = height.length - 1;

        while (leftPointer < rightPointer) {
            int min = Math.min(height[leftPointer], height[rightPointer]);
            maxArea = Math.max(maxArea, (rightPointer - leftPointer) * min);
            if (height[leftPointer] < height[rightPointer]) {
                leftPointer++;
            } else {
                rightPointer--;
            }
        }
        return maxArea;
    }

}
