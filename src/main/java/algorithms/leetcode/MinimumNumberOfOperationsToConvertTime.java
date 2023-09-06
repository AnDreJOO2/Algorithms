package algorithms.leetcode;

/**
 * @link <a href="https://leetcode.com/problems/minimum-number-of-operations-to-convert-time/">https://leetcode.com/problems/minimum-number-of-operations-to-convert-time/</a>
 * @date 07.09.2023
 */
public class MinimumNumberOfOperationsToConvertTime {

    public int convertTime(String current, String correct) {
        int currentH = 0;
        int currentM = 0;
        int correctH = 0;
        int correctM = 0;

        if (current.charAt(0) == 0) {
            currentH = current.charAt(1) - '0';
        } else {
            currentH = (current.charAt(0) - '0') * 10 + current.charAt(1) - '0';
        }

        if (current.charAt(3) == 0) {
            currentM = current.charAt(4) - '0';
        } else {
            currentM = (current.charAt(3) - '0') * 10 + current.charAt(4) - '0';
        }
        if (correct.charAt(0) == 0) {
            correctH = correct.charAt(1) - '0';
        } else {
            correctH = (correct.charAt(0) - '0') * 10 + correct.charAt(1) - '0';
        }

        if (correct.charAt(3) == 0) {
            correctM = correct.charAt(4) - '0';
        } else {
            correctM = (correct.charAt(3) - '0') * 10 + correct.charAt(4) - '0';
        }
        int operations = 0;

        if (currentH > correctH) {
            operations += 24 - currentH + correctH;
        } else if (currentH < correctH) {
            operations += correctH - currentH;
        }

        if (currentM > correctM) {
            int dif = 60 - currentM + correctM;
            if (operations > 0) {
                operations--;
            }
            while (dif != 0) {
                int divide15 = dif / 15;
                if (divide15 > 0) {
                    operations += divide15;
                    dif -= divide15 * 15;
                }
                int divide5 = dif / 5;
                if (dif > 0 && divide5 > 0) {
                    operations += divide5;
                    dif -= divide5 * 5;
                }
                if (dif > 0) {
                    operations += dif;
                    dif = 0;
                }
            }
        } else {
            int dif = correctM - currentM;
            while (dif != 0) {
                int divide15 = dif / 15;
                if (divide15 > 0) {
                    operations += divide15;
                    dif -= divide15 * 15;
                }
                int divide5 = dif / 5;
                if (dif > 0 && divide5 > 0) {
                    operations += divide5;
                    dif -= divide5 * 5;
                }
                if (dif > 0) {
                    operations += dif;
                    dif = 0;
                }
            }
        }
        return operations;
    }

}

