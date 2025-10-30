/*

Input: n = 5
Output:
5 x 1 = 5
5 x 2 = 10
...
5 x 10 = 50

*/

class MultiplicationTable {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <= 10; i++)
            System.out.println(n + " x " + i + " = " + (n * i));
    }
}
