package algorithms.leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class StudentAttendanceRecordITest {

    private StudentAttendanceRecordI underTest;

    @BeforeEach
    void setUp() {
        underTest = new StudentAttendanceRecordI();
    }

    @ParameterizedTest(name = "Params: s=`{0}`, expected={1}")
    @MethodSource("shouldCheckStudentAttendanceRecordIParams")
    void shouldCheckStudentAttendanceRecordI(String s, boolean expected) {
        //when
        boolean result = underTest.checkRecord(s);
        //then
        assertThat(result)
                .isNotNull()
                .isEqualTo(expected);
    }


    static Stream<Arguments> shouldCheckStudentAttendanceRecordIParams() {
        return Stream.of(
                arguments("underTest", true),
                arguments("PPALLL", false)
        );
    }
}
