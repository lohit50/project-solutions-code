class Solution {
    public long repairCars(int[] ranks, int cars) {
        int max = Integer.MIN_VALUE;
        long l = 1;
        long r = (long) ranks[0] * cars * cars;
        while(l <= r){
            long mid = (r + l ) / 2 ;
            if(isRepairable(ranks,cars,mid)) r = mid - 1;
            else l = mid + 1;
        }
        return l;
    }
    public static boolean isRepairable(int[] ranks, int cars , long guessTime){
        long count = 0;
        for(int i = 0; i < ranks.length; i++){
            count += Math.sqrt(guessTime/ranks[i]);
        }
        return count >= cars;
    }
}