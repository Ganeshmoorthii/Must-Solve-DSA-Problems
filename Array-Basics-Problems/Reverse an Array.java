/*
Example:
Input → [1, 2, 3, 4]
Output → [4, 3, 2, 1]
*/

import java.util.Arrays;
class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        reverse(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void reverse(int[] arr) {
        int left = 0, right = arr.length - 1;
        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }
}
