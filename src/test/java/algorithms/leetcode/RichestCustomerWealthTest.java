package algorithms.leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class RichestCustomerWealthTest {

    private RichestCustomerWealth richestCustomerWealth;

    @BeforeEach
    void setUp() {
        richestCustomerWealth = new RichestCustomerWealth();
    }

    @ParameterizedTest(name = "Params: accounts=`{0}`, expected=`{1}`")
    @MethodSource("shouldFindRichestCustomerWealthParams")
    void shouldFindRichestCustomerWealth(int[][] accounts, int expected) {
        // when
        int result = richestCustomerWealth.maximumWealth(accounts);
        // then
        assertThat(result)
                .isNotNull()
                .isEqualTo(expected);

    }

    static Stream<Arguments> shouldFindRichestCustomerWealthParams() {
        return Stream.of(
                arguments(new int[][]{
                        new int[]{1, 2, 3},
                        new int[]{3, 2, 1}
                }, 6),
                arguments(new int[][]{
                        new int[]{1, 5},
                        new int[]{7, 3},
                        new int[]{3, 5}
                }, 10),
                arguments(new int[][]{
                        new int[]{2, 8, 7},
                        new int[]{7, 1, 3},
                        new int[]{1, 9, 5}
                }, 17)
        );
    }
}