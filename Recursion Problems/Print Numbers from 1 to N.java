/*

Problem: Print numbers from 1 to N using recursion.
Example:
Input: N = 5
Output: 1 2 3 4 5

*/

class Main {
    static void print1ToN(int n) {
        if (n == 0) return;
        print1ToN(n - 1);
        System.out.print(n + " ");
    }

    public static void main(String[] args) {
        print1ToN(5);
    }
}
