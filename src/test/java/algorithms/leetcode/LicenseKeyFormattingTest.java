package algorithms.leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class LicenseKeyFormattingTest {

    private LicenseKeyFormatting licenseKeyFormatting;

    @BeforeEach
    void setUp() {
        licenseKeyFormatting = new LicenseKeyFormatting();
    }

    @ParameterizedTest(name = "Params: input=`{0}`, k=`{1}`, expected=`{2}`")
    @MethodSource("shouldFormattingLicensedKeysParams")
    void shouldFormattingLicensedKeys(String input, int k, String expected) {
        //when
        String result = licenseKeyFormatting.licenseKeyFormatting(input, k);
        //then
        assertThat(result)
                .isNotNull()
                .isEqualTo(expected)
                .hasSameSizeAs(expected)
                .isNotSameAs(expected);
    }


    static Stream<Arguments> shouldFormattingLicensedKeysParams() {
        return Stream.of(
                arguments("5F3Z-2e-9-w", 4, "5F3Z-2E9W"),
                arguments("2-5g-3-J", 2, "2-5G-3J"),
                arguments("--a-a-a-a--", 2, "AA-AA")
        );
    }
}