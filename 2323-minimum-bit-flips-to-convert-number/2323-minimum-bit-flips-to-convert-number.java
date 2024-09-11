class Solution {
    public int minBitFlips(int start, int goal) {
        String start_bin = Integer.toBinaryString(start);
        String end_bin = Integer.toBinaryString(goal);

        System.out.printf("%s\n", start_bin);
        System.out.printf("%s\n", end_bin);

        int maxLength = Math.max(start_bin.length(), end_bin.length());

        int count = 0;

        for (int i = start_bin.length() - 1, j = end_bin.length() - 1; i >= 0 || j >= 0; i--, j--) {
            char startChar = (i >= 0) ? start_bin.charAt(i) : '0'; // Use '0' if out of bounds
            char endChar = (j >= 0) ? end_bin.charAt(j) : '0'; // Use '0' if out of bounds

            if (startChar != endChar) {
                count++;
            }
        }

        return count;
    }
}
