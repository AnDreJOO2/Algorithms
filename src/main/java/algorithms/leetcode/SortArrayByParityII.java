package algorithms.leetcode;

/**
 * @link <a href="https://leetcode.com/problems/sort-array-by-parity-ii/">https://leetcode.com/problems/sort-array-by-parity-ii/</a>
 * @date 23.04.2023
 */
public class SortArrayByParityII {
    public int[] sortArrayByParityIISecond(int[] nums) {

        int evenPointer = 0;
        int oddPointer = 1;

        for (int i = 0; i < nums.length; i++) {
            if (i % 2 == 0) {
                if (nums[i] % 2 == 0) {
                    evenPointer += 2;
                } else {
                    while (nums[evenPointer] % 2 != 0 && evenPointer < nums.length) {
                        evenPointer++;
                    }
                    swap(nums, i, evenPointer);
                    evenPointer++;
                }
            } else {
                if (nums[i] % 2 != 0) {
                    oddPointer += 2;
                } else {
                    while (nums[oddPointer] % 2 == 0 && oddPointer < nums.length) {
                        oddPointer++;
                    }
                    swap(nums, i, oddPointer);
                    oddPointer++;
                }
            }
        }
        return nums;
    }

    public int[] sortArrayByParityII(int[] nums) {

        int evenPointer = 0;
        int oddPointer = 1;
        while (evenPointer < nums.length && oddPointer < nums.length) {
            while (evenPointer < nums.length && nums[evenPointer] % 2 == 0) {
                evenPointer += 2;
            }
            while (oddPointer < nums.length && nums[oddPointer] % 2 != 0) {
                oddPointer += 2;
            }
            if (evenPointer < nums.length && oddPointer < nums.length) {
                swap(nums, evenPointer, oddPointer);
            }
        }
        return nums;
    }

    private void swap(int[] nums, int indexOne, int indexTwo) {
        int temp = nums[indexOne];
        nums[indexOne] = nums[indexTwo];
        nums[indexTwo] = temp;
    }
}
