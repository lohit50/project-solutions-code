class Solution {
    public String intToRoman(int num) {
        StringBuilder roman = new StringBuilder();
        int divisor = (int) Math.pow(10, (int) Math.log10(num));
        for (int i = 1; i <= (int) Math.log10(num) + 1; i++) {
            int digit = num / divisor;
            digit %= 10;
            digit *= divisor;
            divisor /= 10;

            if (digit >= 1000) {
                while (digit != 0) {
                    roman.append("M");
                    digit -= 1000;
                }
            } else if (digit == 900)
                roman.append("CM");
            else if (digit >= 500) {
                roman.append("D");
                digit -= 500;
                while (digit != 0) {
                    roman.append("C");
                    digit -= 100;
                }
            } else if (digit == 400)
                roman.append("CD");
            else if (digit >= 100) {
                while (digit != 0) {
                    roman.append("C");
                    digit -= 100;
                }
            } else if (digit == 90)
                roman.append("XC");
            else if (digit >= 50) {
                roman.append("L");
                digit -= 50;
                while (digit != 0) {
                    roman.append("X");
                    digit -= 10;
                }
            } else if (digit == 40)
                roman.append("XL");
            else if (digit >= 10) {
                while (digit != 0) {
                    roman.append("X");
                    digit -= 10;
                }
            } else if (digit == 9)
                roman.append("IX");
            else if (digit >= 5) {
                roman.append("V");
                digit -= 5;
                while (digit != 0) {
                    roman.append("I");
                    digit -= 1;
                }
            } else if (digit == 4)
                roman.append("IV");
            else if (digit >= 1) {
                while (digit != 0) {
                    roman.append("I");
                    digit -= 1;
                }
            }
        }
        return roman.toString();
    }
}