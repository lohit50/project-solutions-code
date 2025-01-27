import java.util.HashSet;
import java.util.Set;

class Solution {

    // Predefined Set of vowels for fast lookup
    private static final Set<Character> VOWELS = new HashSet<>();

    static {
        for (char c : "aeiouAEIOU".toCharArray()) {
            VOWELS.add(c);
        }
    }

    // Function to check if a character is a vowel
    public boolean isVowel(char letter) {
        return VOWELS.contains(letter);
    }

    public String reverseVowels(String s) {
        StringBuilder string = new StringBuilder(s);

        int left = 0;
        int right = string.length() - 1;

        while (left < right) {
            // Store results of isVowel to avoid redundant checks
            boolean leftIsVowel = isVowel(string.charAt(left));
            boolean rightIsVowel = isVowel(string.charAt(right));

            if (leftIsVowel && rightIsVowel) {
                // Swap vowels
                char temp = string.charAt(left);
                string.setCharAt(left, string.charAt(right));
                string.setCharAt(right, temp);

                left++;
                right--;
            } else if (!leftIsVowel) {
                left++;
            } else {
                right--;
            }
        }

        return string.toString();
    }
}
