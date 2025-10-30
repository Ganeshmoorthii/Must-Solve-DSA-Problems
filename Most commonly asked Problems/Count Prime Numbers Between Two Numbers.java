/*
Example:
Input → 10, 20
Output → 4 (11, 13, 17, 19)
*/

class PrimesInRange {
    static boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= Math.sqrt(n); i++)
            if (n % i == 0) return false;
        return true;
    }

    public static void main(String[] args) {
        int start = 10, end = 20, count = 0;
        for (int i = start; i <= end; i++)
            if (isPrime(i)) count++;

        System.out.println("Number of primes = " + count);
    }
}
