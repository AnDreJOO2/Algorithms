package algorithms.sorting;

/**
 * @date 23.12.2022
 */
public class MergeSort {

    public void mergeSort(int[] array) {

        // variable to keep the input array length
        int arrayLength = array.length;

        // if array has less than 2 elements, it is already sorted
        if (arrayLength < 2) {
            return;
        }

        // variable with middle index of the array to future divide
        int middleIndex = arrayLength / 2;

        // divided left and right half of the original input array
        int[] leftHalf = new int[middleIndex];
        int[] rightHalf = new int[arrayLength - middleIndex];

        // for to fill the left array with data from original input array
        for (int i = 0; i < middleIndex; i++) {
            leftHalf[i] = array[i];
        }

        // for to fill the right array with data from original input array
        for (int i = middleIndex; i < arrayLength; i++) {
            rightHalf[i - middleIndex] = array[i];
        }

        // recursive call to sort each half
        mergeSort(leftHalf);
        mergeSort(rightHalf);

        // merge
        merge(array, leftHalf, rightHalf);
    }

    public void merge(int[] array, int[] leftHalf, int[] rightHalf) {

        // variables to keep the length of each half
        int leftHalfLength = leftHalf.length;
        int rightHalfLength = rightHalf.length;

        // variables to iterate in each half
        int i = 0; // to iterate through the left half
        int j = 0; // to iterate through the right half
        int k = 0; // to iterate through the original array

        // while loop to iterate through each half and order elements
        while (i < leftHalfLength && j < rightHalfLength) {

            if (leftHalf[i] <= rightHalf[j]) {
                array[k] = leftHalf[i];
                i++;

            } else {
                array[k] = rightHalf[j];
                j++;
            }
            k++;
        }

        // while loop to iterate through the leftHalf array to add remains elements.
        while (i < leftHalfLength) {
            array[k] = leftHalf[i];
            i++;
            k++;
        }

        // while loop to iterate through the rightHalf array to add remains elements.
        while (j < rightHalfLength) {
            array[k] = rightHalf[j];
            j++;
            k++;
        }

    }

}

