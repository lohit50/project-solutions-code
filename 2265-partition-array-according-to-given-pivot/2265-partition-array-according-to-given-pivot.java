class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int n = nums.length;
        int pos = 0;
        for (int i = 0; i < n; i++) {
            if (nums[i] < pivot) {
                for (int j = i; j > pos; j--) {
                    swap(nums, j, j - 1);
                }
                pos++;
            }
        }
        
        int pivotStart = pos;
        for (int i = pos; i < n; i++) {
            if (nums[i] == pivot) {
                for (int j = i; j > pivotStart; j--) {
                    swap(nums, j, j - 1);
                }
                pivotStart++;
            }
        }
        
        return nums;
    }
    
    private void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
