package algorithms.leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class GoatLatinTest {

    private GoatLatin underTest;

    @BeforeEach
    void setUp() {
        underTest = new GoatLatin();
    }

    @ParameterizedTest(name = "Params: sentence=`{0}`, expected=`{1}`")
    @MethodSource("shouldConvertTextToGoatLatinParams")
    void shouldConvertTextToGoatLatin(String sentence, String expected) {
        //when
        String result = underTest.toGoatLatin(sentence);
        //then
        assertThat(result)
                .isNotNull()
                .hasSameSizeAs(expected)
                .isEqualTo(expected);
    }


    static Stream<Arguments> shouldConvertTextToGoatLatinParams() {
        return Stream.of(
                arguments("I speak Goat Latin", "Imaa peaksmaaa oatGmaaaa atinLmaaaaa"),
                arguments("The quick brown fox jumped over the lazy dog",
                        "heTmaa uickqmaaa rownbmaaaa oxfmaaaaa umpedjmaaaaaa overmaaaaaaa hetmaaaaaaaa azylmaaaaaaaaa ogdmaaaaaaaaaa")
        );
    }
}
