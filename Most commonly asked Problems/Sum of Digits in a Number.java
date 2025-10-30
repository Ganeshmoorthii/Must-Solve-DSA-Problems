/*
Example:
Input → 1234
Output → 10 (1 + 2 + 3 + 4)
*/

class SumOfDigits {
    public static void main(String[] args) {
        int n = 1234, sum = 0;

        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }

        System.out.println("Sum = " + sum);
    }
}
