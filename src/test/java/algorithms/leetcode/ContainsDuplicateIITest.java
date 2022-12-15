package algorithms.leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class ContainsDuplicateIITest {

    private ContainsDuplicateII containsDuplicateII;

    @BeforeEach
    void setUp() {
        containsDuplicateII = new ContainsDuplicateII();
    }

    @Test
    void containsNearbyDuplicateShouldReturnTrue() {

        assertThat(containsDuplicateII.containsNearbyDuplicate(new int[]{1, 2, 3, 1}, 3)).isTrue();
        assertThat(containsDuplicateII.containsNearbyDuplicate(new int[]{1, 0, 1, 1}, 1)).isTrue();
    }

    @Test
    void containsNearbyDuplicateShouldReturnFalse() {

        assertThat(containsDuplicateII.containsNearbyDuplicate(new int[]{1, 2, 3, 1, 2, 3}, 2)).isFalse();
    }
}
