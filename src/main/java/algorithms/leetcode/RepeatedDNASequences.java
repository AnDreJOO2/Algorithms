package algorithms.leetcode;

import java.util.*;

/**
 * @link <a href="https://leetcode.com/problems/repeated-dna-sequences/">https://leetcode.com/problems/repeated-dna-sequences/</a>
 * @date 17.03.2023
 */
public class RepeatedDNASequences {
    public List<String> findRepeatedDnaSequences(String s) {

        HashMap<String, Integer> uniqueValues = new HashMap<>();
        for (int i = 0; i <= s.length() - 10; i++) {
            uniqueValues.put(s.substring(i, i + 10), uniqueValues.getOrDefault(s.substring(i, i + 10), 0) + 1);
        }
        List<String> sequences = new ArrayList<>();
        uniqueValues.entrySet()
                .stream()
                .filter(entrySet -> entrySet.getValue() > 1)
                .forEach(entrySet -> sequences.add(entrySet.getKey()));
        return sequences;
    }

    public List<String> findRepeatedDnaSequencesTwo(String s) {
        Set<String> set = new HashSet<>();
        Set<String> actuallSet = new HashSet<>();
        for (int i = 0; i <= s.length() - 10; i++) {
            if (set.contains(s.substring(i, i + 10))) {
                actuallSet.add(s.substring(i, i + 10));
            } else {
                set.add(s.substring(i, i + 10));
            }
        }
        return actuallSet.stream().toList();
    }

}
