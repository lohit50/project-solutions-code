class Solution {
    public int hIndex(int[] citations) {
        Arrays.sort(citations);
        int result = 0;
        for (int i = 0; i < citations.length; i++) {
            int remainingPapers = citations.length - i;
            if (citations[i] >= remainingPapers) {
                result = remainingPapers;
                break;
            }
        }
        return result;
    }
}


