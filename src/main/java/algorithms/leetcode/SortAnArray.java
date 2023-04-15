package algorithms.leetcode;

/**
 * @link <a href="https://leetcode.com/problems/sort-an-array/">https://leetcode.com/problems/sort-an-array/</a>
 * @date 15.04.2023
 */
public class SortAnArray {
    public int[] sortArray(int[] nums) {
        mergeSort(nums);
        return nums;
    }

    private void mergeSort(int[] nums) {
        if (nums.length < 2) {
            return;
        }

        int middle = nums.length / 2;
        int[] leftHalf = new int[middle];
        int[] rightHalf = new int[nums.length - middle];
        for (int i = 0; i < middle; i++) {
            leftHalf[i] = nums[i];
        }
        for (int i = middle; i < nums.length; i++) {
            rightHalf[i - middle] = nums[i];
        }

        mergeSort(leftHalf);
        mergeSort(rightHalf);
        merge(nums, leftHalf, rightHalf);
    }

    private void merge(int[] nums, int[] leftHalf, int[] rightHalf) {
        int i = 0;
        int j = 0;
        int k = 0;

        while (i < leftHalf.length && j < rightHalf.length) {
            if (leftHalf[i] < rightHalf[j]) {
                nums[k] = leftHalf[i];
                i++;
            } else {
                nums[k] = rightHalf[j];
                j++;
            }
            k++;
        }
        while (i < leftHalf.length) {
            nums[k] = leftHalf[i];
            i++;
            k++;
        }
        while (j < rightHalf.length) {
            nums[k] = rightHalf[j];
            j++;
            k++;
        }
    }

}
// merge sort