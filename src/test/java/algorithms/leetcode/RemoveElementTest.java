package algorithms.leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class RemoveElementTest {

    private RemoveElement removeElement;

    @BeforeEach
    void setUp() {
        removeElement = new RemoveElement();
    }

    @Test
    void removeElementShouldPassTheTest() {
        assertThat(removeElement.removeElement(new int[]{2, 3, 3, 2}, 3)).isEqualTo(2);
        assertThat(removeElement.removeElement(new int[]{0, 1, 2, 2, 3, 0, 4, 2}, 2)).isEqualTo(5);
    }

    @Test
    void removeElementShouldNotPassTheTest() {
        assertThat(removeElement.removeElement(new int[]{2, 3, 3, 2}, 3)).isNotEqualTo(3);
        assertThat(removeElement.removeElement(new int[]{0, 1, 2, 2, 3, 0, 4, 2}, 2)).isNotEqualTo(4);
    }
}
