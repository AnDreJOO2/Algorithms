package algorithms.leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * @link <a href="https://leetcode.com/problems/reformat-date/">https://leetcode.com/problems/reformat-date/</a>
 * @date 15.08.2023
 */
public class ReformatDate {
    public String reformatDate(String date) {
        Map<String, String> map = new HashMap<>() {{
            put("Jan", "01");
            put("Feb", "02");
            put("Mar", "03");
            put("Apr", "04");
            put("May", "05");
            put("Jun", "06");
            put("Jul", "07");
            put("Aug", "08");
            put("Sep", "09");
            put("Oct", "10");
            put("Nov", "11");
            put("Dec", "12");
        }};

        StringBuilder sb = new StringBuilder();
        sb.append(date.substring(date.length() - 4));
        sb.append("-");
        sb.append(map.get(date.substring(date.length() - 8, date.length() - 5)));
        sb.append("-");
        if (date.charAt(1) - '9' <= 0) {
            sb.append(date.charAt(0));
            sb.append(date.charAt(1));
        } else {
            sb.append("0");
            sb.append(date.charAt(0));
        }
        return sb.toString();
    }

}
