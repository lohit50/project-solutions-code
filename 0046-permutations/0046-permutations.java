class Solution {
    public void Generate(int[] nums, List<List<Integer>> permutations, List<Integer> temp){
        if(temp.size() == nums.length){
            permutations.add(List.copyOf(temp));
            return;
        }
        for(int i = 0; i < nums.length; i++){
            if(!temp.contains(nums[i])){
                temp.add(nums[i]);
                Generate(nums,permutations,temp);
                temp.remove(temp.size() - 1);
            }
        }
    }
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> permutations = new ArrayList();
        List<Integer> temp = new ArrayList();
        Generate(nums,permutations,temp);
        return permutations;
    }
}