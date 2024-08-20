class Solution {
    public boolean isHappy(int num) {
        int temp_num = num;
        int sum = 0;

        while (true) {  
            sum = 0;
            int digits = (int) Math.log10(temp_num) + 1;  

            for (int j = 0; j < digits; j++) {
                sum = sum + (int) Math.pow(temp_num % 10, 2);
                temp_num = temp_num / 10;
            }

            if (sum == 1) {
                return true;  // Found a happy number
            }

            // If sum == 4, it means we're in a non-happy cycle.
            if (sum == 4) {
                return false;  // Not a happy number
            }

            temp_num = sum;  // Continue the loop with the new sum
        }
    }
}
