package algorithms.sorting;

import java.util.Random;

/**
 * @date 15.03.2023
 * @source https://youtu.be/h8eyY7dIiN4
 */
public class QuickSort {


    public void quickSort(int[] array) {
        quickSort(array, 0, array.length - 1);
    }

    private void quickSort(int[] array, int startIndex, int endIndex) {

        if (startIndex >= endIndex) {
            return;
        }

        // get pivot
        // efficient strategy to get pivot
        int pivotIndex = new Random().nextInt(endIndex - startIndex) + startIndex; // index between startIndex - endIndex
        int pivot = array[pivotIndex]; // pivot based on random index
        swap(array, pivotIndex, endIndex); // swap pivot element with last element

        // start of partitioning part
        int lp = startIndex; // left pointer;
        int rp = endIndex; // right pointer;

        while (lp < rp) { // while left pointer is less than right pointer

            while (array[lp] <= pivot && lp < rp) { // while element at left pointer is less equal pivot and left pointer is less than right pointer
                lp++; // increment left pointer
            }
            while (array[rp] >= pivot && lp < rp) { // while element at right pointer is greater equal pivot and left pointer is less than right pointer
                rp--; // decrement right pointer
            }
            swap(array, lp, rp); // swap elements
        }

        // it fixes an issue where the last value could potentially be out of order
        if (array[lp] > array[endIndex]) {
            swap(array, lp, endIndex);
        } else {
            lp = endIndex;
        }

        // end of partitioning part

        quickSort(array, startIndex, lp - 1); // quicksort left half
        quickSort(array, lp + 1, endIndex); // quicksort right half
    }

    private void swap(int[] array, int index1, int index2) { // function to swap elements in array
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

}
