package algorithms.leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class RansomNoteTest {

    private RansomNote ransomNote;

    @BeforeEach
    void setUp() {
        ransomNote = new RansomNote();
    }

    @ParameterizedTest(name = "Params: note=`{0}`, magazine=`{1}`, expected=`{2}`")
    @MethodSource("ransomNoteParams")
    void shouldRansomNote(String note, String magazine, boolean expected) {
        //when
        boolean result = ransomNote.canConstruct(note, magazine);
        //then
        assertThat(result)
                .isNotNull()
                .isEqualTo(expected);
    }

    static Stream<Arguments> ransomNoteParams() {

        return Stream.of(
                arguments("a", "b", false),
                arguments("aa", "ab", false),
                arguments("aa", "aab", true)
        );
    }
}