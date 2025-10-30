/*
Example:
Input → "hello"
Output → "olleh"
*/

class ReverseString {
    public static void main(String[] args) {
        String s = "hello";
        String rev = new StringBuilder(s).reverse().toString();
        System.out.println("Reversed: " + rev);
    }
}

// Time: O(n)
