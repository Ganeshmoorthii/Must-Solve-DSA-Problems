/*
Example:
Input → "swiss"
Output → 'w'
*/

import java.util.*;
class FirstNonRepeating {
    public static void main(String[] args) {
        String s = "swiss";
        Map<Character, Integer> map = new LinkedHashMap<>();

        for (char c : s.toCharArray())
            map.put(c, map.getOrDefault(c, 0) + 1);

        for (Map.Entry<Character, Integer> e : map.entrySet()) {
            if (e.getValue() == 1) {
                System.out.println("First non-repeating: " + e.getKey());
                return;
            }
        }
        System.out.println("No unique character");
    }
}

// Time: O(n)
