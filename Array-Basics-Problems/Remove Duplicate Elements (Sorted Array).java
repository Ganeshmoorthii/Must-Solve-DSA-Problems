/*
Example:
Input → [1,1,2,2,3,3,4]
Output → [1,2,3,4]
*/

import java.util.Arrays;
class RemoveDuplicates {
    public static void main(String[] args) {
        int[] arr = {1,1,2,2,3,3,4};
        int len = removeDuplicates(arr);
        System.out.println(Arrays.toString(Arrays.copyOf(arr, len)));
    }

    static int removeDuplicates(int[] arr) {
        int j = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[j]) arr[++j] = arr[i];
        }
        return j + 1;
    }
}
