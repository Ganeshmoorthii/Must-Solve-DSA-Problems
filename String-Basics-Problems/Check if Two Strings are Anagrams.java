/*
Example:
Input → "listen" and "silent" → Anagrams
Input → "hello" and "world" → Not Anagrams
*/

import java.util.Arrays;
class AnagramCheck {
    public static void main(String[] args) {
        String s1 = "listen", s2 = "silent";
        char[] a1 = s1.toCharArray(), a2 = s2.toCharArray();
        Arrays.sort(a1);
        Arrays.sort(a2);
        if (Arrays.equals(a1, a2))
            System.out.println("Anagram");
        else
            System.out.println("Not Anagram");
    }
}

// Time: O(n log n)
