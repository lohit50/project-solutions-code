class Solution {


    public static void Generate(int[] candidates, int target, int remain, List<Integer> sol, List<List<Integer>> ans, int number){
        if(remain == 0){
            ans.add(new ArrayList(sol));        /// Base case
            return;
        }
        for(int i = number ; i < candidates.length; i++){
            if(remain - candidates[i] >= 0){
                sol.add(candidates[i]);
                Generate(candidates, target, remain - candidates[i], sol, ans, i);
                sol.remove(sol.size()-1);
            }
        }
    }

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> sol = new ArrayList<>();
        int remain = target;
        int number = 0;
        Generate(candidates, target, remain, sol, ans, number);
        return ans;

    }
}