class Solution {
    public int minBitFlips(int start, int goal) {
        // Convert integers to binary strings
        String start_bin = Integer.toBinaryString(start);
        String end_bin = Integer.toBinaryString(goal);

        // Print binary representations for debugging
        System.out.printf("%s\n", start_bin);
        System.out.printf("%s\n", end_bin);

        // Determine the maximum and minimum length of the binary strings
        int maxLength = Math.max(start_bin.length(), end_bin.length());
        int minLength = Math.min(start_bin.length(), end_bin.length());

        int count = 0;
        int remain = 0;

        for (int i = 0, j = 0; i < minLength && j < minLength; i++, j++) {
            if (start_bin.charAt(start_bin.length() - minLength + i) != end_bin.charAt(end_bin.length() - minLength + j)) {
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
