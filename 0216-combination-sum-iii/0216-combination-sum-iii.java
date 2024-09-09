class Solution {
    private void backtrack(int start, int k, int n, List<Integer> combinations, List<List<Integer>> res) {
        if (k == 0) {
            if(n==0){
                res.add(new ArrayList<>(combinations));
            }
            return;
        }
        
        
        for (int i = start; i <= 9; i++) {
            combinations.add(i);
            backtrack(i + 1, k - 1, n - i, combinations, res);
            combinations.remove(combinations.size() - 1);
        }
    }
    
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> combinations = new ArrayList<>();
        backtrack(1, k, n, combinations, res);
        return res;
    }
}