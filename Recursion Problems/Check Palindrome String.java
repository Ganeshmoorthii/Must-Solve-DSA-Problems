/*

Example: Input: "madam" → Output: true

*/

class Main {
    static boolean isPalindrome(String s, int start, int end) {
        if (start >= end) return true;
        if (s.charAt(start) != s.charAt(end)) return false;
        return isPalindrome(s, start + 1, end - 1);
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome("madam", 0, 4));
    }
}
