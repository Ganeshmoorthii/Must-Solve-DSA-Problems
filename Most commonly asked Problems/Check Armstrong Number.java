/*
Definition: A number equal to the sum of cubes of its digits.
Example:
153 = 1³ + 5³ + 3³ → 153 (Armstrong)
*/

class Armstrong {
    public static void main(String[] args) {
        int n = 153, sum = 0, temp = n;
        while (temp > 0) {
            int d = temp % 10;
            sum += d * d * d;
            temp /= 10;
        }

        System.out.println(sum == n ? "Armstrong" : "Not Armstrong");
    }
}
