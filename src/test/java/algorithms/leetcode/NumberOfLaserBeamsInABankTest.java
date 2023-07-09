package algorithms.leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class NumberOfLaserBeamsInABankTest {

    private NumberOfLaserBeamsInABank numberOfLaserBeamsInABank;

    @BeforeEach
    void setUp() {
        numberOfLaserBeamsInABank = new NumberOfLaserBeamsInABank();
    }

    @ParameterizedTest(name = "Params: bank=`{0}`, expected=`{1}`")
    @MethodSource("shouldCalculateNumberOfLaserBeamsInABankParams")
    void shouldCalculateNumberOfLaserBeamsInABank(String[] bank, int expected) {
        //when
        int result = numberOfLaserBeamsInABank.numberOfBeams(bank);
        //then
        assertThat(result)
                .isNotNull()
                .isEqualTo(expected);
    }

    static Stream<Arguments> shouldCalculateNumberOfLaserBeamsInABankParams() {
        return Stream.of(
                arguments(new String[]{"011001", "000000", "010100", "001000"}, 8),
                arguments(new String[]{"000", "111", "000"}, 0)
        );
    }
}
