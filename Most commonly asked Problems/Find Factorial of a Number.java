/*
Example:
Input → n = 5
Output → 120 (5 × 4 × 3 × 2 × 1)
*/

class Factorial {
    public static void main(String[] args) {
        int n = 5;
        long fact = 1;
        for (int i = 1; i <= n; i++)
            fact *= i;

        System.out.println("Factorial = " + fact);
    }
}
