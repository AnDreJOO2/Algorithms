package algorithms.leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class NumberOfStudentsDoingHomeworkAtAGivenTimeTest {

    private NumberOfStudentsDoingHomeworkAtAGivenTime numberOfStudentsDoingHomeworkAtAGivenTime;

    @BeforeEach
    void setUp() {
        numberOfStudentsDoingHomeworkAtAGivenTime = new NumberOfStudentsDoingHomeworkAtAGivenTime();
    }

    @ParameterizedTest(name = "Params: startTime=`{0}`, endTime=`{1}`, queryTime=`{2}`, expected=`{3}`")
    @MethodSource("shouldFindNumberOfStudentsDoingHomeworkAtAGivenTimeParams")
    void shouldFindNumberOfStudentsDoingHomeworkAtAGivenTime(int[] startTime, int[] endTime, int queryTime, int expected) {
        //when
        int result = numberOfStudentsDoingHomeworkAtAGivenTime.busyStudent(startTime, endTime, queryTime);
        //then
        assertThat(result)
                .isNotNull()
                .isEqualTo(expected);
    }

    static Stream<Arguments> shouldFindNumberOfStudentsDoingHomeworkAtAGivenTimeParams() {
        return Stream.of(
                arguments(new int[]{1, 2, 3}, new int[]{3, 2, 7}, 4, 1),
                arguments(new int[]{4}, new int[]{4}, 4, 1)
        );
    }
}