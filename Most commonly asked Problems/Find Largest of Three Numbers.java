/*
Example:
Input → a = 10, b = 25, c = 5
Output → Largest = 25
*/

class LargestOfThree {
    public static void main(String[] args) {
        int a = 10, b = 25, c = 5;
        int largest = (a > b) ? (a > c ? a : c) : (b > c ? b : c);
        System.out.println("Largest = " + largest);
    }
}
