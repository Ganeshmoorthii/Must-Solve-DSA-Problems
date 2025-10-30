/*
Example:
Input → "programming"
Output → "progamin"
*/

import java.util.*;
class RemoveDuplicates {
    public static void main(String[] args) {
        String s = "programming";
        StringBuilder sb = new StringBuilder();
        Set<Character> seen = new HashSet<>();

        for (char c : s.toCharArray()) {
            if (!seen.contains(c)) {
                seen.add(c);
                sb.append(c);
            }
        }
        System.out.println("Without duplicates: " + sb);
    }
}

// Time: O(n)
