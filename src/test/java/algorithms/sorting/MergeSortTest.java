package algorithms.sorting;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Random;

import static org.assertj.core.api.Assertions.assertThat;

class MergeSortTest {

    private MergeSort mergeSort;
    private Random random;

    @BeforeEach
    void setUp() {
        mergeSort = new MergeSort();
        random = new Random(100000);

    }

    private int[] generateTestArray(Random random) {
        int[] array = new int[10000];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt();
        }
        return array;
    }

    @Test
    void mergeSortShouldSortArrayWithRandomValues() {
        int[] testArray = generateTestArray(random);
        mergeSort.mergeSort(testArray);
        assertThat(testArray).isSorted();
    }
}
