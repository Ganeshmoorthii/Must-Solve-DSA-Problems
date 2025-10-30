/*
Example:
Input → "HeLLo"
Output → "hEllO"
*/

class ToggleCase {
    public static void main(String[] args) {
        String s = "HeLLo";
        StringBuilder sb = new StringBuilder();

        for (char c : s.toCharArray()) {
            if (Character.isUpperCase(c))
                sb.append(Character.toLowerCase(c));
            else if (Character.isLowerCase(c))
                sb.append(Character.toUpperCase(c));
            else
                sb.append(c);
        }

        System.out.println("Toggled: " + sb);
    }
}

// Time: O(n) 
