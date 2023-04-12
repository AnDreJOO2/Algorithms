package algorithms.leetcode;

/**
 * @link <a href="https://leetcode.com/problems/reverse-vowels-of-a-string/">https://leetcode.com/problems/reverse-vowels-of-a-string/</a>
 * @date 13.04.2023
 */
public class ReverseVowelsOfAString {
    public String reverseVowels(String s) {

        int leftPointer = 0;
        int rightPointer = s.length() - 1;
        char[] chars = s.toCharArray();
        while (leftPointer < rightPointer) {
            if (!isVowel(chars[leftPointer])) {
                leftPointer++;
                continue;
            }
            if (!isVowel(chars[rightPointer])) {
                rightPointer--;
                continue;
            }
            swap(chars, leftPointer, rightPointer);
            leftPointer++;
            rightPointer--;
        }
        return String.valueOf(chars);
    }

    private boolean isVowel(char ch) {
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'
                || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U';
    }

    private void swap(char[] array, int i, int j) {
        char temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }


}
