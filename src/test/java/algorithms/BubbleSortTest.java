package algorithms;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class BubbleSortTest {

    private BubbleSort bubbleSort;

    @BeforeEach
    void setUp(){
        bubbleSort = new BubbleSort();
    }

    @Test
    void bubbleSort_should_return_sorted_array() {
        assertThat(bubbleSort.bubbleSort(new int[]{2,6,23,64,43,64,23,8,9,42,1,1123,6,5,34,7,4,12,1,27,4,3,8589,4,12,46,45,612,62,6,9,87,2,123,7,9,3245,1,2,65,7})).isSorted();
        assertThat(bubbleSort.bubbleSort(new int[]{2,6,23,64,43,8,9,42,1,1123,6,5,34,7,4,12,1,7,4,3,66,23,8,9,42,1,18589,4,12,46,45,612,62,6,9,87,2,123,7,9,3245,1,2,65,7})).isSorted();
        assertThat(bubbleSort.bubbleSort(new int[]{2,6,5,64,43,8,9,42,1,1123,6,58,64,23,8,9,42,1,1123,6,5,34,7,44,23,8,9,42,1,17,9,3245,1,2,65,7})).isSorted();
        assertThat(bubbleSort.bubbleSort(new int[]{2,6,23,64,43,64,23,8,9,42,1,1123,6,5,34,7,4,12,1,7,4,3,8589,4,12,46,45,612,62,6,9,87,2,123,7,9,3245,1,2,65,7})).isSorted();
        assertThat(bubbleSort.bubbleSort(new int[]{2,6,8,9,42,1,1123,6,5,23,64,43,64,23,8,9,42,1,1123,6,5,4,23,8,9,42,1,1,4,3,5123,4,12,46,45,612,62,6,9,87,2,123,7,9,3245,1,2,65,7})).isSorted();
    }
}
