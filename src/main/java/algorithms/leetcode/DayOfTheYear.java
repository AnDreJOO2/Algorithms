package algorithms.leetcode;

/**
 * @link <a href="https://leetcode.com/problems/day-of-the-year/">https://leetcode.com/problems/day-of-the-year/</a>
 * @date 06.08.2023
 */
public class DayOfTheYear {

    public int dayOfYear(String date) {
        int[] daysOfMonths = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int year = Integer.parseInt(date.substring(0, 4));
        int month = Integer.parseInt(date.substring(5, 7));
        int result = Integer.parseInt(date.substring(8));
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            if (month > 2) {
                result++;
            }
        }
        for (int i = 0; i < month - 1; i++) {
            result += daysOfMonths[i];
        }
        return result;
    }

}
