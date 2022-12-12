package algorithms;

import java.util.HashMap;

/**
 * @link <a href="https://leetcode.com/problems/roman-to-integer/">https://leetcode.com/problems/roman-to-integer/</a>
 * @date 12.12.2022
 */
public class RomanToInteger {
    public int romanToInt(String s) {
        HashMap<Character, Integer> hashMap = new HashMap<>();
        hashMap.put('I', 1);
        hashMap.put('V', 5);
        hashMap.put('X', 10);
        hashMap.put('L', 50);
        hashMap.put('C', 100);
        hashMap.put('D', 500);
        hashMap.put('M', 1000);

        char[] chars = s.toCharArray();
        int value = 0;

        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == 'I') {
                if (i < chars.length - 1) {
                    if (chars[i + 1] == 'V') {
                        value += 4;
                        i++;
                        continue;
                    } else if (chars[i + 1] == 'X') {
                        value += 9;
                        i++;
                        continue;
                    }
                }
                value += hashMap.get('I');
            } else if (chars[i] == 'V') {
                value += hashMap.get('V');
            } else if (chars[i] == 'X') {
                if (i < chars.length - 1) {
                    if (chars[i + 1] == 'L') {
                        value += 40;
                        i++;
                        continue;
                    } else if (chars[i + 1] == 'C') {
                        value += 90;
                        i++;
                        continue;
                    }
                }
                value += hashMap.get('X');
            } else if (chars[i] == 'L') {
                value += hashMap.get('L');
            } else if (chars[i] == 'C') {
                if (i < chars.length - 1) {
                    if (chars[i + 1] == 'D') {
                        value += 400;
                        i++;
                        continue;
                    } else if (chars[i + 1] == 'M') {
                        value += 900;
                        i++;
                        continue;
                    }
                }
                value += hashMap.get('C');
            } else if (chars[i] == 'D') {
                value += hashMap.get('D');
            } else if (chars[i] == 'M') {
                value += hashMap.get('M');
            }
        }
        return value;
    }

}
