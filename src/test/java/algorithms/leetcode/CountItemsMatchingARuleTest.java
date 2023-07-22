package algorithms.leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class CountItemsMatchingARuleTest {

    private CountItemsMatchingARule countItemsMatchingARule;

    @BeforeEach
    void setUp() {
        countItemsMatchingARule = new CountItemsMatchingARule();
    }

    @ParameterizedTest(name = "Params: items=`{0}`, ruleKey=`{1}`, ruleValue=`{2}`, expected=`{3}`")
    @MethodSource("shouldCountItemsMatchingARuleParams")
    void shouldCountItemsMatchingARule(List<List<String>> items, String ruleKey, String ruleValue, int expected) {
        //when
        int result = countItemsMatchingARule.countMatches(items, ruleKey, ruleValue);
        //then
        assertThat(result)
                .isNotNull()
                .isEqualTo(expected);
    }

    static Stream<Arguments> shouldCountItemsMatchingARuleParams() {
        return Stream.of(
                arguments(List.of(
                        List.of("phone", "blue", "pixel"),
                        List.of("computer", "silver", "lenovo"),
                        List.of("phone", "gold", "iphone")), "color", "silver", 1),
                arguments(List.of(
                        List.of("phone", "blue", "pixel"),
                        List.of("computer", "silver", "phone"),
                        List.of("phone", "gold", "iphone")), "type", "phone", 2));
    }
}
