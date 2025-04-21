class Solution {
    public int numberOfArrays(int[] diff, int lower, int upper) {
        int[] sample = new int[diff.length + 1];
        sample[0] = lower;

        // sample creation : 
        for(int i = 1; i <= diff.length; i++){
            sample[i] = sample[i-1] + diff[i-1];
        }
        // System.out.println(Arrays.toString(sample));

        int min = sample[0];
        int max = sample[1];
        for(int i = 0; i < sample.length; i++){
            min = Math.min(min,sample[i]);
            max = Math.max(max,sample[i]);
        }

        if(min == lower && max == upper) return 1;
        if(max >= upper) return 0;

        // System.out.println(min + " " + max);
        int add = lower - min;
        min += add;
        max += add;
        if(max > upper) return 0;
        return upper - max + 1;
    }
}