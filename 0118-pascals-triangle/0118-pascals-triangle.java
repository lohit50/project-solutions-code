class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        result.add(Arrays.asList(1));
        if(numRows == 1) return result;
        result.add(Arrays.asList(1,1));
        if(numRows == 2) return result;
        for(int i = 0; i < numRows - 2; i++){
            AddList(result);
        }
        return result;
    }
    public static void AddList(List<List<Integer>> result){
        List<Integer> temp = new ArrayList<>();
        List<Integer> prev = result.get(result.size() - 1);
        temp.add(1);
        for(int i = 0; i < prev.size() - 1; i++){
            temp.add(prev.get(i) + prev.get(i+1));
        }
        temp.add(1);
        result.add(temp);
    }
}