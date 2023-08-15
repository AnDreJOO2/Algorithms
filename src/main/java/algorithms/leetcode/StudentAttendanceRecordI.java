package algorithms.leetcode;

/**
 * @link <a href="https://leetcode.com/problems/student-attendance-record-i/">https://leetcode.com/problems/student-attendance-record-i/</a>
 * @date 15.08.2023
 */
public class StudentAttendanceRecordI {
    public boolean checkRecord(String s) {

        int countA = 0;
        int countL = 0;
        for (char ch : s.toCharArray()) {
            if (ch == 'A') {
                countA++;
            }
            if (ch == 'L') {
                countL++;
            } else {
                countL = 0;
            }
            if (countA == 2 || countL == 3) {
                return false;
            }
        }
        return true;

    }
}
