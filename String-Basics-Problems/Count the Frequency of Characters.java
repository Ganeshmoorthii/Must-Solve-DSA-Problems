/*
Example:
Input → "hello"
Output →
h → 1
e → 1
l → 2
o → 1
*/

import java.util.*;
class S10_CharFrequency {
    public static void main(String[] args) {
        String s = "hello";
        Map<Character, Integer> freq = new LinkedHashMap<>();

        for (char c : s.toCharArray())
            freq.put(c, freq.getOrDefault(c, 0) + 1);

        for (Map.Entry<Character, Integer> e : freq.entrySet())
            System.out.println(e.getKey() + " → " + e.getValue());
    }
}

// Time: O(n)
