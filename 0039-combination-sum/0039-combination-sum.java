class Solution {
    private void backtrack(int start,List<List<Integer>> res,List<Integer> combination,int[] candidates,int target){
        if(target == 0) {res.add(new ArrayList<>(combination)); return;}
        if(target<0) return;
        for(int i=start;i<candidates.length;i++){
            combination.add(candidates[i]);
            backtrack(i,res,combination,candidates,target-candidates[i]);
            combination.removeLast();
        }
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> combination = new ArrayList<>();
        backtrack(0,res,combination,candidates,target);
        return res;
    }
}