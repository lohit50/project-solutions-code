class Solution {
    public int findJudge(int n, int[][] trust) {
        if (trust.length == 0 && n == 1) return n;

        int[] trusted  = new int[n + 1];
        int[] trusters = new int[n + 1];

        int res = -1;
        
        for(int t[] : trust){
            trusters[t[0]] += 1;
            trusted[t[1]] += 1;
        }
        for(int i=1; i<=n; i++){
            if(trusters[i] == 0 && trusted[i] == n-1){
                res = i; 
            }
        }

        System.out.println(Arrays.toString(trusted));
        System.out.println(Arrays.toString(trusters));

        return res;
    }
}