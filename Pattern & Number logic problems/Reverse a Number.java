/*

Input: 1234
Output: 4321

*/

class ReverseNumber {
    public static void main(String[] args) {
        int n = 1234, rev = 0;
        while (n > 0) {
            rev = rev * 10 + n % 10;
            n /= 10;
        }
        System.out.println("Reversed = " + rev);
    }
}
