/*
Example: Input: x = 2, n = 5 → Output: 32
*/

class Main {
    static int power(int x, int n) {
        if (n == 0) return 1;
        return x * power(x, n - 1);
    }

    public static void main(String[] args) {
        System.out.println(power(2, 5));
    }
}
