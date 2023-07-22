package algorithms.leetcode;

import java.util.HashSet;
import java.util.Set;

/**
 * @link <a href="https://leetcode.com/problems/decode-the-message/">https://leetcode.com/problems/decode-the-message/</a>
 * @date 22.07.2023
 */
public class DecodeTheMessage {
    public String decodeMessage(String key, String message) {
        char[] dictionary = new char[26];
        int dictionaryIterator = 0;
        int keyIterator = 0;
        Set<Character> occurrences = new HashSet<>();

        while (dictionaryIterator < dictionary.length) {
            char currentChar = key.charAt(keyIterator);
            if (currentChar == ' ') {
                keyIterator++;
                continue;
            }
            if (!occurrences.contains(currentChar)) {
                occurrences.add(currentChar);
                dictionary[currentChar - 'a'] = (char) (dictionaryIterator + 'a');
                dictionaryIterator++;
            }
            keyIterator++;
        }

        StringBuilder sb = new StringBuilder();
        for (char ch : message.toCharArray()) {
            if (ch == ' ') {
                sb.append(ch);
            } else {
                sb.append(dictionary[ch - 'a']);
            }
        }
        return sb.toString();
    }

}
