class Solution {
    public int hIndex(int[] citations) {
        int result = 0;
        for(int i = 0; i < citations.length; i++){
            int count = 0;
            for(int j = 0; j < citations.length; j++){
                if(citations[j] >= citations[i] && citations[i] != 0){
                   
                    count++;
                }
            }
            if (count >= citations[i]) {
                result = Math.max(result, citations[i]);
            } else {
                result = Math.max(result, count);
            }

        }
        return result;
    }
}

