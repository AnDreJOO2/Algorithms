package algorithms;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class EuclidesTest {

    private Euclides euclides;

    @BeforeEach
    void setUp(){
        euclides = new Euclides();
    }

    @Test
    void euclides_should_pass_the_test() {

        assertThat(euclides.euclides(12,6)).isEqualTo(6);
        assertThat(euclides.euclides(24,6)).isEqualTo(6);
        assertThat(euclides.euclides(128,64)).isEqualTo(64);
        assertThat(euclides.euclides(25,15)).isEqualTo(5);
        assertThat(euclides.euclides(100,75)).isEqualTo(25);
        assertThat(euclides.euclides(1024,200)).isEqualTo(8);
    }
}
