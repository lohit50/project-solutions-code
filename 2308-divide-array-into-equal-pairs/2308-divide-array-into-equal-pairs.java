class Solution {
    public boolean divideArray(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int i : nums){
            if(set.contains(i)) set.remove(i);
            else set.add(i);
        }
        if(set.size() != 0) return false;
        return true;
    }
}

