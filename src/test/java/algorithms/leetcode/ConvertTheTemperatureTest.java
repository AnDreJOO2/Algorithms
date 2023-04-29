package algorithms.leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class ConvertTheTemperatureTest {

    private ConvertTheTemperature convertTheTemperature;

    @BeforeEach
    void setUp() {
        convertTheTemperature = new ConvertTheTemperature();
    }

    @ParameterizedTest(name = "Params: celsius=`{0}`, expected={1}")
    @MethodSource("shouldConvertCelsiusToKelvinAndFahrenheitParams")
    void shouldConvertCelsiusToKelvinAndFahrenheit(double celsius, double[] expected) {
        //when
        double[] result = convertTheTemperature.convertTemperature(celsius);
        //then
        assertThat(result)
                .isNotNull()
                .hasSameSizeAs(expected)
                .isEqualTo(expected);
    }

    static Stream<Arguments> shouldConvertCelsiusToKelvinAndFahrenheitParams() {
        return Stream.of(
                arguments(36.50, new double[]{309.65000, 97.70000}),
                arguments(122.11, new double[]{395.26000, 251.79800})
        );
    }
}