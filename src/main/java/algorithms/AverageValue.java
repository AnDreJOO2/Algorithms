package algorithms;

/**
 * @date 11.12.2022
 */
public class AverageValue {

    public double averageValue(int[] array) {
        double sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum / array.length;
    }
}
