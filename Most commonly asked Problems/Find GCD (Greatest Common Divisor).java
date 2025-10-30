/*
Example:
Input → a = 36, b = 60
Output → 12
*/

class GCD {
    static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static void main(String[] args) {
        System.out.println("GCD = " + gcd(36, 60));
    }
}
