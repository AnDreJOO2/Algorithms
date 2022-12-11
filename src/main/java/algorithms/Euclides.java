package algorithms;

/**
 * @date 11.12.2022
 */
public class Euclides {

    public int euclides(int a, int b) {

        int c = a % b;
        if (c == 0) {
            return b;
        } else {
            return euclides(b, c);
        }

    }
}
