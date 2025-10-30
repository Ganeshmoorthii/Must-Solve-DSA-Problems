/*
Example:
Input → [1, 2, 4, 5] (N = 5)
Output → Missing = 3
*/

class MissingNumber {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5};
        int n = 5;
        int expected = n * (n + 1) / 2;
        int sum = 0;
        for (int val : arr) sum += val;
        System.out.println("Missing = " + (expected - sum));
    }
}
