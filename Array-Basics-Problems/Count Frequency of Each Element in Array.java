/*
Example:
Input → [10, 20, 10, 30, 20, 10]
Output →
10 → 3
20 → 2
30 → 1
*/

import java.util.*;
class FrequencyCount {
    public static void main(String[] args) {
        int[] arr = {10, 20, 10, 30, 20, 10};
        Map<Integer, Integer> freq = new HashMap<>();
        for (int val : arr)
            freq.put(val, freq.getOrDefault(val, 0) + 1);

        for (Map.Entry<Integer, Integer> e : freq.entrySet())
            System.out.println(e.getKey() + " → " + e.getValue());
    }
}
