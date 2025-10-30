/*
Example:
Input → [3, 7, 2, 9, 4]
Output → Largest = 9, Smallest = 2
*/

class LargestSmallest {
    public static void main(String[] args) {
        int[] arr = {3, 7, 2, 9, 4};
        int max = arr[0], min = arr[0];
        for (int val : arr) {
            if (val > max) max = val;
            if (val < min) min = val;
        }
        System.out.println("Largest = " + max + ", Smallest = " + min);
    }
}

// Time: O(n) | Space: O(1)
