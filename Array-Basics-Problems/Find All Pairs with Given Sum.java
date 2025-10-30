/*
Example:
Input → [1, 5, 7, -1, 5], sum = 6
Output → (1,5), (7,-1)
*/

import java.util.*;
class PairsWithSum {
    public static void main(String[] args) {
        int[] arr = {1, 5, 7, -1, 5};
        int target = 6;
        Set<Integer> seen = new HashSet<>();
        for (int val : arr) {
            int complement = target - val;
            if (seen.contains(complement)) {
                System.out.println("(" + val + ", " + complement + ")");
            }
            seen.add(val);
        }
    }
}
