package algorithms.leetcode;

import java.util.Arrays;

/**
 * @link <a href="https://leetcode.com/problems/boats-to-save-people/">https://leetcode.com/problems/boats-to-save-people/</a>
 * @date 03.04.2023
 */
public class BoatsToSavePeople {
    public int numRescueBoats(int[] people, int limit) {

        Arrays.sort(people);
        int leftPointer = 0;
        int rightPointer = people.length - 1;
        int boats = 0;
        while (leftPointer <= rightPointer) {
            if (people[leftPointer] + people[rightPointer] <= limit) {
                leftPointer++;
            }
            rightPointer--;
            boats++;
        }
        return boats;
    }
}
