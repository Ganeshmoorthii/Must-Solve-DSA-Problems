/*
Example:
Input → [1, 2, 3, 4, 5]
Output → [2, 3, 4, 5, 1]
*/

import java.util.Arrays;
class LeftRotate {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int first = arr[0];
        for (int i = 1; i < arr.length; i++) arr[i - 1] = arr[i];
        arr[arr.length - 1] = first;
        System.out.println(Arrays.toString(arr));
    }
}
