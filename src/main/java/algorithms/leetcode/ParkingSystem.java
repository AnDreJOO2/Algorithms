package algorithms.leetcode;

/**
 * @link <a href="https://leetcode.com/problems/design-parking-system/">https://leetcode.com/problems/design-parking-system/</a>
 * @date 29.05.2023
 */
public class ParkingSystem {

    int[] places = new int[4];

    public ParkingSystem(int big, int medium, int small) {
        this.places[1] = big;
        this.places[2] = medium;
        this.places[3] = small;
    }

    public boolean addCar(int carType) {
        if (this.places[carType] == 0) {
            return false;
        }
        this.places[carType]--;
        return true;
    }
}
