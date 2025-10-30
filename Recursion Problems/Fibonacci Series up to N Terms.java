/*

Example: Input: 6 → Output: 0 1 1 2 3 5

*/

class Main {
    static int fib(int n) {
        if (n <= 1) return n;
        return fib(n - 1) + fib(n - 2);
    }

    public static void main(String[] args) {
        for (int i = 0; i < 6; i++)
            System.out.print(fib(i) + " ");
    }
}
