/*
Example:
Input → "I am learning Java"
Output → "IamlearningJava"
*/

class RemoveWhitespaces {
    public static void main(String[] args) {
        String s = "I am learning Java";
        String res = s.replaceAll("\\s+", "");
        System.out.println("Without spaces: " + res);
    }
}

// Time: O(n)
