class Solution {
    public static boolean[] primeList; // Stores precomputed prime status

    public void precomputePrimes(int limit) {
        primeList = new boolean[limit + 1];
        Arrays.fill(primeList, true);
        primeList[0] = primeList[1] = false; // 0 and 1 are not prime

        // Sieve of Eratosthenes
        for (int i = 2; i * i <= limit; i++) {
            if (primeList[i]) {
                for (int j = i * i; j <= limit; j += i) {
                    primeList[j] = false;
                }
            }
        }
    }

    public boolean isPrime(int n) {
        if (n < primeList.length) {
            return primeList[n]; // Fast lookup from precomputed list
        }
        return false; // If out of range, consider non-prime (can be expanded dynamically)
    }

    public int[] closestPrimes(int left, int right) {
        precomputePrimes(right); // Compute primes up to `right`
        int[] pair = new int[]{-1, -1};
        int last_prime = -1;

        for (int i = left; i <= right; i++) {
            if (i > 2 && i % 2 == 0) continue; // Skip even numbers
            if (isPrime(i)) {
                if (last_prime != -1) {
                    if (pair[0] == -1 || (i - last_prime < pair[1] - pair[0])) {
                        pair[0] = last_prime;
                        pair[1] = i;
                    }
                }
                last_prime = i;
            }
        }

        return pair;
    }
}
