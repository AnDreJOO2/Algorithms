package algorithms.leetcode;

/**
 * @link <a href="https://leetcode.com/problems/average-salary-excluding-the-minimum-and-maximum-salary/">https://leetcode.com/problems/average-salary-excluding-the-minimum-and-maximum-salary/</a>
 * @date 01.05.2023
 */
public class AverageSalaryExcludingTheMinimumAndMaximumSalary {
    public double average(int[] salary) {
        int sum = 0;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < salary.length; i++) {
            min = Math.min(min, salary[i]);
            max = Math.max(max, salary[i]);
            sum += salary[i];
        }
        return (double) (sum - min - max) / (salary.length - 2);
    }
}
