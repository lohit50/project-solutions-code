class Solution {
    public static void Generate(int[] nums, List<Integer> sol ,List<List<Integer>> ans){
        if(sol.size() == nums.length){
            ans.add(new ArrayList(sol));
        }
        for(int i : nums){
            if(!sol.contains(i)){
                sol.add(i);
                Generate(nums,sol,ans);
                sol.remove(sol.size()-1);
            }
        }
    }

    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> sol = new ArrayList<>(); 
        Generate(nums, sol, ans);
        return ans;
    }
}