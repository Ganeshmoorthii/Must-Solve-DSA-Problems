/*
Example:
Input → "hello"
Output → Vowels = 2, Consonants = 3
*/

class S4_CountVowelsConsonants {
    public static void main(String[] args) {
        String s = "hello";
        int vowels = 0, consonants = 0;
        s = s.toLowerCase();

        for (char c : s.toCharArray()) {
            if (Character.isLetter(c)) {
                if ("aeiou".indexOf(c) != -1)
                    vowels++;
                else
                    consonants++;
            }
        }

        System.out.println("Vowels = " + vowels + ", Consonants = " + consonants);
    }
}

// Time: O(n)
