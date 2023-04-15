package algorithms.leetcode;

/**
 * @link <a href="https://leetcode.com/problems/license-key-formatting/">https://leetcode.com/problems/license-key-formatting/</a>
 * @date 15.04.2023
 */
public class LicenseKeyFormatting {
    public String licenseKeyFormatting(String s, int k) {
        StringBuilder sb = new StringBuilder();
        int counter = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) != '-' && counter == k) {
                sb.append("-");
                counter = 0;
            }
            if (s.charAt(i) != '-') {
                sb.append(s.charAt(i));
                counter++;
            }
        }
        return sb.reverse().toString().toUpperCase();
    }
}
