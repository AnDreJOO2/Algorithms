package algorithms.leetcode;

/**
 * @link <a href="https://leetcode.com/problems/count-primes/">https://leetcode.com/problems/count-primes/</a>
 * @date 08.07.2023
 */
public class CountPrimes {
    public int countPrimes(int n) {

        int count = 0;
        boolean[] primes = new boolean[n];
        for (int i = 0; i < primes.length; i++) {
            primes[i] = true;
        }

        for (int i = 2; i * i < primes.length; i++) {
            if (primes[i]) {
                for (int j = i * i; j < primes.length; j += i) {
                    primes[j] = false;
                }
            }
        }

        for (int i = 2; i < primes.length; i++) {
            if (primes[i]) {
                count++;
            }
        }
        return count;
    }
}

// Sieve of Eratosthenes algorithm
