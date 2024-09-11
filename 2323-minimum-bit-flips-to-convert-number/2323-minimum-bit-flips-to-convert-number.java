class Solution {
    public int minBitFlips(int start, int goal) {

        String start_bin = Integer.toBinaryString(start);
        String end_bin = Integer.toBinaryString(goal);

        System.out.printf("%s\n", start_bin);
        System.out.printf("%s\n", end_bin);

        int maxLength = Math.max(start_bin.length(), end_bin.length());
        int minLength = Math.min(start_bin.length(), end_bin.length());

        int count = 0;
        int remain = 0;

        for (int i = start_bin.length() - 1, j = end_bin.length() - 1; i >= 0 && j >= 0; i--, j--) {
            if (start_bin.charAt(i) != end_bin.charAt(j)) {
                count++;
            }
        }

        for (int i = 0; i < maxLength - minLength; i++) {
            if (start_bin.length() > end_bin.length()) {
                if (start_bin.charAt(i) == '1') {
                    remain++;
                }
            } else {
                if (end_bin.charAt(i) == '1') {
                    remain++;
                }
            }
        }

        return count + remain;
    }
}
