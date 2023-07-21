package algorithms.leetcode;

import java.util.HashSet;
import java.util.Set;

/**
 * @link <a href="https://leetcode.com/problems/unique-morse-code-words/">https://leetcode.com/problems/unique-morse-code-words/</a>
 * @date 21.07.2023
 */
public class UniqueMorseCodeWords {
    public int uniqueMorseRepresentations(String[] words) {
        String[] letters = new String[]{
                ".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..",
                "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-",
                "-.--", "--.."
        };

        StringBuilder sb = new StringBuilder();
        Set<String> uniqueCodes = new HashSet<>();
        for (int i = 0; i < words.length; i++) {
            for (char ch : words[i].toCharArray()) {
                sb.append(letters[ch - 'a']);
            }
            uniqueCodes.add(sb.toString());
            sb.setLength(0);
        }
        return uniqueCodes.size();
    }
}
