class Solution {
    public int maxFreq(String s, int maxLetters, int minSize, int maxSize) {
        HashMap<String, Integer> freqMap = new HashMap<>();
        int[] letters = new int[123]; 
        int l = 0, unique_letter = 0, max = 0;

        for (int i = 0; i < minSize; i++) {
            if (letters[s.charAt(i)] == 0) {
                unique_letter++;
            }
            letters[s.charAt(i)]++;
        }

        // if (unique_letter <= maxLetters) {
        //     String sub = s.substring(l, l + minSize);
        //     freqMap.put(sub, freqMap.getOrDefault(sub, 0) + 1);
        //     max = Math.max(max, freqMap.get(sub));
        // }

        for (int r = minSize - 1; r < s.length(); r++) {
            if (unique_letter <= maxLetters) {
                String sub = s.substring(l, l + minSize);
                freqMap.put(sub, freqMap.getOrDefault(sub, 0) + 1);
                max = Math.max(max, freqMap.get(sub));
            }
             if (r + 1 < s.length()) {
                if (letters[s.charAt(r + 1)] == 0) {
                    unique_letter++;
                }
                letters[s.charAt(r + 1)]++;

                letters[s.charAt(l)]--;
                if (letters[s.charAt(l)] == 0) {
                    unique_letter--;
                }
                l++;
            }
        }

        return max;
    }
}
