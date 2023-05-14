package algorithms.leetcode;

/**
 * @link <a href="https://leetcode.com/problems/number-of-students-doing-homework-at-a-given-time/">https://leetcode.com/problems/number-of-students-doing-homework-at-a-given-time/</a>
 * @date 14.05.2023
 */
public class NumberOfStudentsDoingHomeworkAtAGivenTime {
    public int busyStudent(int[] startTime, int[] endTime, int queryTime) {
        int count = 0;
        for (int i = 0; i < startTime.length; i++) {
            if (startTime[i] <= queryTime && endTime[i] >= queryTime) {
                count++;
            }
        }
        return count;
    }
}
