/*
Example:
Input → n = 7
Output → Prime
*/

class PrimeCheck {
    public static void main(String[] args) {
        int n = 7;
        boolean isPrime = true;

        if (n <= 1) isPrime = false;
        else {
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        System.out.println(isPrime ? "Prime" : "Not Prime");
    }
}
