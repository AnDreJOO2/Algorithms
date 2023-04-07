package algorithms.leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class FlippingAnImageTest {

    private FlippingAnImage flippingAnImage;

    @BeforeEach
    void setUp() {
        flippingAnImage = new FlippingAnImage();
    }

    @ParameterizedTest(name = "Params: input=`{0}`, expected=`{1}`")
    @MethodSource("shouldFlipAndInvertImageParams")
    void shouldFlipAndInvertImage(int[][] input, int[][] expected) {
        //when
        flippingAnImage.flipAndInvertImage(input);
        //then
        assertThat(input)
                .isNotNull()
                .isDeepEqualTo(expected);
    }

    static Stream<Arguments> shouldFlipAndInvertImageParams() {
        return Stream.of(
                arguments(new int[][]{
                                {1, 1, 0},
                                {1, 0, 1},
                                {0, 0, 0}
                        },
                        new int[][]{
                                {1, 0, 0},
                                {0, 1, 0},
                                {1, 1, 1}
                        }),
                arguments(new int[][]{
                                {1, 1, 0, 0},
                                {1, 0, 0, 1},
                                {0, 1, 1, 1},
                                {1, 0, 1, 0}
                        },
                        new int[][]{
                                {1, 1, 0, 0},
                                {0, 1, 1, 0},
                                {0, 0, 0, 1},
                                {1, 0, 1, 0}
                        })

        );
    }
}