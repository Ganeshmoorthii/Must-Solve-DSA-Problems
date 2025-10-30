/*
Example:
Input → [10, 5, 8, 20, 15]
Output → Second Largest = 15
*/

class Q2_SecondLargest {
    public static void main(String[] args) {
        int[] arr = {10, 5, 8, 20, 15};
        int largest = Integer.MIN_VALUE, second = Integer.MIN_VALUE;
        for (int val : arr) {
            if (val > largest) {
                second = largest;
                largest = val;
            } else if (val > second && val != largest) {
                second = val;
            }
        }
        System.out.println("Second Largest = " + second);
    }
}

// Time: O(n)
