class Solution {
    public List<Integer> getRow(int row) {
        if(row == 0) return Arrays.asList(1);
        List<Integer> prev = new ArrayList<>();
        prev.add(1);
        prev.add(1);
        if(row == 1) return prev;
        for(int i = 2; i <= row ; i++){
            List<Integer> crnt = new ArrayList<>();
            crnt.add(1);
            for(int j = 0; j < prev.size() - 1; j++){
                crnt.add(prev.get(j) + prev.get(j+1));
            }
            crnt.add(1);
            prev = crnt;
        }
        return prev;
    }
}