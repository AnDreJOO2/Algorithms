package algorithms.leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class DestinationCityTest {

    private DestinationCity underTest;

    @BeforeEach
    void setUp() {
        underTest = new DestinationCity();
    }

    @ParameterizedTest(name = "Params: paths=`{0}`, expected={1}")
    @MethodSource("shouldDestinationCityParams")
    void shouldDestinationCity(List<List<String>> paths, String expected) {
        //when
        String result = underTest.destCity(paths);
        //then
        assertThat(result)
                .isNotNull()
                .hasSameSizeAs(expected)
                .isEqualTo(expected);
    }


    static Stream<Arguments> shouldDestinationCityParams() {
        return Stream.of(
                arguments(List.of(
                        List.of("London", "New York"),
                        List.of("New York", "Lima"),
                        List.of("Lima", "Sao Paulo")
                ), "Sao Paulo"),
                arguments(List.of(
                        List.of("B", "C"),
                        List.of("D", "B"),
                        List.of("C", "A")
                ), "A")
        );
    }
}
