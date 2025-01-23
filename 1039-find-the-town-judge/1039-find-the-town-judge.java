class Solution {
    public int findJudge(int n, int[][] trust) {
        if (trust.length == 0 && n == 1) return n;
        int[] people  = new int[n + 1];
        int[] trusters = new int[n + 1];
        int res = -1;
        for (int[] t: trust) {
            trusters[t[0]] += 1;
            int yaru = t[0];
            if (res == yaru) return -1;
            int yara = t[1];
            people[yara] += 1;
            if (people[yara] == n - 1) res = yara;
        }
        System.out.println(Arrays.toString(people));
        System.out.println(Arrays.toString(trusters));
        int max = 0;
        for(int i=0; i<people.length;i++){
            if(people[i] > max){
                max = people[i];
                res = i;
            }else if(people[i] == max){
                res = -1;
            }
        }
        if(res != -1 && trusters[res] != 0) res = -1;
        if(max != n-1) res = -1;
        return res;
    }
}