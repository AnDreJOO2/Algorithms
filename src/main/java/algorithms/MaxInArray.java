package algorithms;

/**
 * @date 11.12.2022
 */
public class MaxInArray {

    public int maxInArray(int[] array) {
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }
}
