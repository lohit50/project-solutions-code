class Solution {
    public int maximumCandies(int[] candies, long k) {
       int l = 0 , r = (int)1e7;
       while(l < r){
        int mid = (r + l + 1) / 2;
        long s = 0;
        for(int i : candies) s += i/mid;
        if(s < k) r = mid - 1;
        else l = mid;
       }
        return l;
    }
}