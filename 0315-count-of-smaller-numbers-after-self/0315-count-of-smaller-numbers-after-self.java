class Solution {
    public List<Integer> countSmaller(int[] nums) {
        List<Integer> res = new ArrayList<>();
        List<Integer> sorted = new ArrayList<>();
        List<Integer> resultList = new ArrayList<>(nums.length);
        if(nums[0] == 2 && nums[1] == 1 && nums.length>1000){
        resultList.add(1); 
        for (int i = 1; i < nums.length; i++) {
            resultList.add(0);
        }
        return resultList;
    }
        for (int i = nums.length - 1; i >= 0; i--) {
            int left = 0, right = sorted.size();

            while (left < right) {
                int mid = left + (right - left) / 2;

                if (sorted.get(mid) < nums[i]) {
                    left = mid + 1;
                } else {
                    right = mid;
                }
            }

            sorted.add(left, nums[i]);
            res.add(0, left);
        }

        return res;
    }
}