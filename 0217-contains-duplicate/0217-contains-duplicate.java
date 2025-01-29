class Solution {
    public boolean containsDuplicate(int[] nums) {
         Set<Integer> set = IntStream.of(nums).boxed().collect(Collectors.toSet());
        return set.size() != nums.length;
    }
}