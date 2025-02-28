class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> result = new ArrayList();
        int greatest = 0;
        for(int i = 0; i < candies.length; i++){
            greatest = Math.max(greatest , candies[i]);
        }
        for(int i = 0; i < candies.length; i++){
            result.add( (candies[i] + extraCandies) >= greatest ? true : false);
        }
        System.out.print(greatest);
        return result;
    }
}