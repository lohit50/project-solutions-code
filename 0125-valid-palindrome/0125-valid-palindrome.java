class Solution {
    public boolean isPalindrome(String Str) {
        String s = Str.toLowerCase();
        int left = 0;
        int right = s.length() - 1;
        for (char chr : s.toCharArray()) {
            if (!(Character.isLetterOrDigit(s.charAt(right)) && Character.isLetterOrDigit(s.charAt(left)))) {
                if (!Character.isLetterOrDigit(s.charAt(left))) {
                    left++;
                }
                if (!Character.isLetterOrDigit(s.charAt(right))) {
                    right--;
                }
            } else if ((Character.isLetterOrDigit(s.charAt(right)) && Character.isLetterOrDigit(s.charAt(left)))) {
                System.out.printf("%c - %c\n", s.charAt(left), s.charAt(right));
                if (s.charAt(left) == s.charAt(right)) {
                    left++;
                    right--;
                } else {
                    return false;
                }
            }
        }
        return true;
    }
}
