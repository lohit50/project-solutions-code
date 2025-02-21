class Solution {
    public int myAtoi(String s) {
        StringBuilder result = new StringBuilder("0");
        s = s.replaceFirst("^\\s+", "");
        int sign = +1;
        int digit_flag = 0;
        int last_sign_flag = 0;
        int zero_flag = 0;

        // testcases cheacking conditions :

        for (int i = 0; i < s.length(); i++) {

            // leading zero == > Skipping
            if (s.charAt(i) == '0' && zero_flag == 0)
                continue;

            // cheking for digit and appending it a
            if (Character.isDigit(s.charAt(i))) {
                result.append(s.charAt(i));
                zero_flag = 1;
                digit_flag = 1;
                last_sign_flag = 0;
            }
            if (digit_flag == 1 && !Character.isDigit(s.charAt(i))) {
                    break;
            }

            // letter checking ==> Returning
            if (Character.isLetter(s.charAt(i)))
                    break;

            // sign checking ==> update sign
            if (s.charAt(i) == '-') {
                if (last_sign_flag == 1 || (digit_flag == 0 && i != 0))
                    break;
                else {
                    sign = -1;
                    last_sign_flag = 1;
                }
                continue;
            }
            if (s.charAt(i) == '+') {
                if (last_sign_flag == 1 || (digit_flag == 0 && i != 0))
                    break;
                else {
                    sign = +1;
                    last_sign_flag = 1;
                }
                continue;
            }
            if (!Character.isLetterOrDigit(s.charAt(i))) {
                break;
            }

        }
        long num = 0;
        for (int i = 0; i < result.length(); i++) {
            num = num * 10 + (result.charAt(i) - '0');
            if (sign * num > Integer.MAX_VALUE)
                return Integer.MAX_VALUE;
            if (sign * num < Integer.MIN_VALUE)
                return Integer.MIN_VALUE;
        }
        return (int ) sign * (int) num;
    }
}