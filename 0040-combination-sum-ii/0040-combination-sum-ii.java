class Solution {
    private void backtrack(int start,List<List<Integer>> res,List<Integer> combination,int[] candidates,int target){
        if(target == 0) res.add(new ArrayList<>(combination));
        if(target<0) return;
        for(int i=start;i<candidates.length;i++){
            if (i > start && candidates[i] == candidates[i - 1]) continue;
            combination.add(candidates[i]);
            backtrack(i+1,res,combination,candidates,target-candidates[i]);
            combination.removeLast();
        }
    }
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> combination = new ArrayList<>();
        Arrays.sort(candidates);
        backtrack(0,res,combination,candidates,target);
        return res;
    }
}