package algorithms.leetcode;

/**
 * @link <a href="https://leetcode.com/problems/flipping-an-image/">https://leetcode.com/problems/flipping-an-image/</a>
 * @date 07.04.2023
 */
public class FlippingAnImage {
    public int[][] flipAndInvertImage(int[][] image) {

        for (int i = 0; i < image.length; i++) {
            int leftPointer = 0;
            int rightPointer = image[i].length - 1;
            while (leftPointer < rightPointer) {
                int temp = image[i][leftPointer];
                image[i][leftPointer] = image[i][rightPointer];
                image[i][rightPointer] = temp;

                leftPointer++;
                rightPointer--;
            }
        }
        for (int i = 0; i < image.length; i++) {
            for (int j = 0; j < image[i].length; j++) {
                if (image[i][j] == 1) {
                    image[i][j] = 0;
                } else {
                    image[i][j] = 1;
                }
            }
        }

        return image;
    }
}

