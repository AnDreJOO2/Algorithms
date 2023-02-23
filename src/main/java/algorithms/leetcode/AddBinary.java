package algorithms.leetcode;

/**
 * @link <a href="https://leetcode.com/problems/add-binary/">https://leetcode.com/problems/add-binary/</a>
 * @date 23.02.2023
 */
public class AddBinary {

    public String addBinary(String a, String b) {

        StringBuilder sb = new StringBuilder();

        int aIndex = a.length() - 1;
        int bIndex = b.length() - 1;

        int sum = 0;
        while (aIndex >= 0 || bIndex >= 0) {

            if (aIndex >= 0) {
                sum += a.charAt(aIndex) - '0'; // adds ascii value of the char, then deletes '0' char value, so it lasts 1 or 0
            }

            if (bIndex >= 0) {
                sum += b.charAt(bIndex) - '0'; // adds ascii value of the char, then deletes '0' char value, so it lasts 1 or 0
            }
            sb.append(sum % 2);
            sum /= 2;

            aIndex--;
            bIndex--;
        }
        if (sum != 0) {
            sb.append(sum);
        }

        return sb.reverse().toString();
    }
}
