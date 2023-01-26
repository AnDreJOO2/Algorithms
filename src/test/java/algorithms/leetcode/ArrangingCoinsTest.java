package algorithms.leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class ArrangingCoinsTest {

    private ArrangingCoins arrangingCoins;

    @BeforeEach
    void setUp() {
        arrangingCoins = new ArrangingCoins();
    }

    @Test
    void arrangeCoinsShouldPassTheTest() {
        assertThat(arrangingCoins.arrangeCoins(5)).isEqualTo(2);
        assertThat(arrangingCoins.arrangeCoins(8)).isEqualTo(3);
    }

    @Test
    void arrangeCoinsShouldNotPassTheTest() {
        assertThat(arrangingCoins.arrangeCoins(5)).isNotEqualTo(3);
        assertThat(arrangingCoins.arrangeCoins(8)).isNotEqualTo(4);
    }
}
