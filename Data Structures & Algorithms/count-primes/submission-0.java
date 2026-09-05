class Solution {
    public int countPrimes(int n) {

        // Less than 2 means there are no prime numbers
        if (n <= 2) {
            return 0;
        }

        // isPrime[i] tells whether i is currently considered prime
        boolean[] isPrime = new boolean[n];

        // Initially assume every number from 2 to n-1 is prime
        for (int i = 2; i < n; i++) {
            isPrime[i] = true;
        }

        // Eliminate composite numbers
        for (int i = 2; i * i < n; i++) {

            if (isPrime[i]) {

                // Start from i * i
                for (int j = i * i; j < n; j += i) {
                    isPrime[j] = false;
                }
            }
        }

        // Count remaining prime numbers
        int count = 0;

        for (int i = 2; i < n; i++) {
            if (isPrime[i]) {
                count++;
            }
        }

        return count;
    }
}