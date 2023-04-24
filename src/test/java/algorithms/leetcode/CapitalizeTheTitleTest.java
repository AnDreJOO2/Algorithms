package algorithms.leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class CapitalizeTheTitleTest {

    private CapitalizeTheTitle capitalizeTheTitle;

    @BeforeEach
    void setUp() {
        capitalizeTheTitle = new CapitalizeTheTitle();
    }

    @ParameterizedTest(name = "Params: title =`{0}`, expected=`{1}`")
    @MethodSource("shouldCapitalizeTheTitleParams")
    void shouldCapitalizeTheTitle(String title, String expected) {
        //when
        String result = capitalizeTheTitle.capitalizeTitle(title);
        //then
        assertThat(result)
                .isNotNull()
                .hasSameSizeAs(expected)
                .isEqualTo(expected);
    }

    static Stream<Arguments> shouldCapitalizeTheTitleParams() {
        return Stream.of(
                arguments("capiTalIze tHe titLe", "Capitalize The Title"),
                arguments("First leTTeR of EACH Word", "First Letter of Each Word"),
                arguments("i lOve leetcode", "i Love Leetcode")
        );
    }
}