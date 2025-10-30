/*

Input: n = 10
Output: 2 4 6 8 10

*/

class EvenNumbers {
    public static void main(String[] args) {
        int n = 10;
        for (int i = 2; i <= n; i += 2)
            System.out.print(i + " ");
    }
}
