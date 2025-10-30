/*
Example:
Input → A = [1,3,5], B = [2,4,6]
Output → [1,2,3,4,5,6]
*/

import java.util.Arrays;
class MergeSorted {
    public static void main(String[] args) {
        int[] a = {1,3,5};
        int[] b = {2,4,6};
        int[] res = merge(a, b);
        System.out.println(Arrays.toString(res));
    }

    static int[] merge(int[] a, int[] b) {
        int i = 0, j = 0, k = 0;
        int[] res = new int[a.length + b.length];
        while (i < a.length && j < b.length) {
            if (a[i] <= b[j]) res[k++] = a[i++];
            else res[k++] = b[j++];
        }
        while (i < a.length) res[k++] = a[i++];
        while (j < b.length) res[k++] = b[j++];
        return res;
    }
}
