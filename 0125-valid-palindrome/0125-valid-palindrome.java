class Solution {
    public boolean isPalindrome(String str) {
        int n = str.length();
        int front_index = 0;
        int last_index = n - 1;
        int front_found = 0;
        int last_found = 0;
        char front = '1';
        char last = '1';
        
        while (front_index < last_index) {
            char front_char = str.charAt(front_index);
            char last_char = str.charAt(last_index);

            if (Character.isLetterOrDigit(front_char) && front_found == 0) {
                front = Character.toLowerCase(front_char);
                front_found = 1;
            } else if (front_found == 0) {
                front_index++;
            }

            if (Character.isLetterOrDigit(last_char) && last_found == 0) {
                last = Character.toLowerCase(last_char);
                last_found = 1;
            } else if (last_found == 0) {
                last_index--;
            }

            if (front_found == 1 && last_found == 1) {
                if (front != last) {
                    return false;
                }
                front_found = 0;
                last_found = 0;
                front_index++;
                last_index--;
            }
        }
        return true;
    }
}
