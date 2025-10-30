/*

Problem: Print numbers from N to 1 using recursion.
Example: Input: 5 → Output: 5 4 3 2 1

*/

class Main {
    static void printNTo1(int n) {
        if (n == 0) return;
        System.out.print(n + " ");
        printNTo1(n - 1);
    }

    public static void main(String[] args) {
        printNTo1(5);
    }
}
