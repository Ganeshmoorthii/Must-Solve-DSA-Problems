/*
Example:
Input → [1, 2, 3, 4] → Ascending 
Input → [9, 7, 5] → Descending 
*/

class CheckSorted {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4};
        int[] arr2 = {9, 7, 5};
        System.out.println(isSortedAscending(arr1)); // true
        System.out.println(isSortedDescending(arr2)); // true
    }

    static boolean isSortedAscending(int[] arr) {
        for (int i = 1; i < arr.length; i++)
            if (arr[i] < arr[i - 1]) return false;
        return true;
    }

    static boolean isSortedDescending(int[] arr) {
        for (int i = 1; i < arr.length; i++)
            if (arr[i] > arr[i - 1]) return false;
        return true;
    }
}
