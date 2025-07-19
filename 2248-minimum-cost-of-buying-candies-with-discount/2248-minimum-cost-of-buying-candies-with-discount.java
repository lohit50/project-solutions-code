class Solution {
    public int minimumCost(int[] cost) {
        int result = 0;
        if(cost.length == 1) return cost[0];
        Arrays.sort(cost);
        for(int i = cost.length - 1; i >= 0; i-=3){
            if(i == 0){
                result += cost[i];
                return result;
            }
            result += cost[i]+cost[i-1];
        }
        return result;
    }
}