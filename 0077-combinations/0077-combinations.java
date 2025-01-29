class Solution {


    public static void Generate(int n, int k, int crnt, List<Integer> sol, List<List<Integer>> ans){
        if(sol.size() == k){
            ans.add(new ArrayList<>(sol));
            return;
        }
        for(int i = crnt ; i <= n ; i++){
            if(sol.contains(i)){
                continue;
            }
            if(sol.size() != 0 && sol.get(sol.size() - 1) > i){
                continue;
            }
            else{
                sol.add(i);
                Generate(n,k,crnt + 1,sol,ans);
                sol.remove(sol.size() - 1);
            }
        }
    }

    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> sol = new ArrayList<>();
        int crnt = 1;
        Generate(n,k, crnt, sol,ans);
        return ans;
    }


}