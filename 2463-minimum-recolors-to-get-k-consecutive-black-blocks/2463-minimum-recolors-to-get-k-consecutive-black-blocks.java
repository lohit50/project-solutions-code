class Solution {
    public int minimumRecolors(String blocks, int k) {
        int white_count = 0;
        int black_count = 0;
        int left = 0;
        int right = k-1;
        for(int i = left; i <= right; i++){
            System.out.print(blocks.charAt(i));
            if(blocks.charAt(i) == 'W') white_count++;
            if(blocks.charAt(i) == 'B') black_count++;
        }
        int min = white_count;
        right++;
        left++;
        while(right < blocks.length()){
            if(blocks.charAt(right) == 'W') white_count++;
            else black_count++;
            if(blocks.charAt(left - 1) == 'W') white_count--;
            else black_count--;
            min = Math.min(min,white_count);
            right++;
            left++;
        }
        return min;
    }
}