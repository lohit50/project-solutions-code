class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> result = new ArrayList();
        int greatest = 0;
        for(int i = 0; i < candies.length; i++){
            if( candies[i] > greatest) greatest = candies[i];
        }
        for(int i = 0; i < candies.length; i++){
            result.add( (candies[i] + extraCandies) >= greatest ? true : false);
        }
        return result;
    }
}