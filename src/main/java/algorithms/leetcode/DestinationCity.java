package algorithms.leetcode;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @link <a href="https://leetcode.com/problems/destination-city/">https://leetcode.com/problems/destination-city/</a>
 * @date 15.08.2023
 */
public class DestinationCity {
    public String destCity(List<List<String>> paths) {

        Map<String, String> map = new HashMap<>();
        String destinationCity = paths.get(0).get(1);
        for (int i = 1; i < paths.size(); i++) {
            String city = paths.get(i).get(0);
            if (destinationCity.equals(city)) {
                destinationCity = paths.get(i).get(1);
            }
            if (map.containsKey(city)) {
                destinationCity = map.get(city);
                map.remove(city);
            } else {
                map.put(city, paths.get(i).get(1));
            }
        }
        while (!map.isEmpty()) {
            if (map.containsKey(destinationCity)) {
                destinationCity = map.get(destinationCity);
            } else {
                break;
            }
        }
        return destinationCity;
    }

}
