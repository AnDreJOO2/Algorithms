package algorithms.leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class RotateImageTest {

    private RotateImage rotateImage;

    @BeforeEach
    void setUp() {
        rotateImage = new RotateImage();
    }

    @Test
    void shouldRotate2DArray() {
        //given
        int[][] testArray = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        //when
        int[][] expectedArray = {{7, 4, 1}, {8, 5, 2}, {9, 6, 3}};
        rotateImage.rotate(testArray);
        //then
        assertThat(testArray)
                .isNotNull()
                .isEqualTo(expectedArray)
                .hasSameDimensionsAs(expectedArray);
    }
}