package algorithms;

/**
 * @date 23.12.2022
 */
public class BinarySearch {

    // needs sorted array
    public int binarySearch(int[] array, int target) {

        int startIndex = 0;
        int endIndex = array.length - 1;
        while (startIndex <= endIndex) {
            int middleIndex = startIndex + (endIndex - startIndex) / 2;

            if (array[middleIndex] < target) {
                startIndex = middleIndex + 1;
            } else if (array[middleIndex] > target) {
                endIndex = middleIndex - 1;
            } else if (array[middleIndex] == target) {
                return middleIndex;
            }
        }
        return startIndex;
    }
}
