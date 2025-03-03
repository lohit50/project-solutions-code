
class Solution {
    public int hIndex(int[] citations) {
        Arrays.sort(citations);
        int n = citations.length;
        int hIndex = 0;

        for (int i = n - 1; i >= 0; i--) {
            int remainingPapers = n - i;
            if (citations[i] >= remainingPapers) {
                hIndex = remainingPapers;
            } else {
                break;
            }
        }
        return hIndex;
    }
}
