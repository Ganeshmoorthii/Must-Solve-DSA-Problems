/*
Example:
Input → "hello world from java"
Output → "Hello World From Java"
*/

class CapitalizeWords {
    public static void main(String[] args) {
        String s = "hello world from java";
        String[] words = s.split("\\s+");
        StringBuilder sb = new StringBuilder();

        for (String w : words) {
            sb.append(Character.toUpperCase(w.charAt(0)))
              .append(w.substring(1))
              .append(" ");
        }

        System.out.println("Capitalized: " + sb.toString().trim());
    }
}

// Time: O(n)
