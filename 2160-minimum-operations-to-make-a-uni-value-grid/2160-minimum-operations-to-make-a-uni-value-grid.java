class Solution {

    public static int Count(List<Integer> list, int x){
        int count = 0;
        int divisor = list.get(list.size()/2);
        System.out.println("divisor : " + divisor);
        for(int i = 0; i < list.size(); i++){
            if(Math.abs(list.get(i) - divisor) % x != 0){
                return -1;
            }
            count += Math.abs(list.get(i) - divisor) / x;
        }
        return count;
    }

    public int minOperations(int[][] grid, int x) {
        int operations = 0;
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid[0].length; j++){
                list.add(grid[i][j]);
            }
        }   
        Collections.sort(list);
        System.out.println(list);
        return Count(list,x);
    }
}