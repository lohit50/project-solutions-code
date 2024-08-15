int compare(const void* a, const void* b) {
    return (*(int*)a - *(int*)b);
}

// Function to find the length of the longest consecutive sequence
int longestConsecutive(int* nums, int numsSize) {
    if (numsSize == 0) return 0; // Edge case: empty array

    // Sort the array
    qsort(nums, numsSize, sizeof(int), compare);

    int count = 1;
    int count_max = 1;

    for (int i = 1; i < numsSize; i++) {
        if (nums[i] == nums[i-1] + 1) {
            // If current element is consecutive to the previous one
            count++;
        } else if (nums[i] != nums[i-1]) {
            // If not consecutive, reset the count
            count = 1;
        }
        // Update the maximum count
        if (count > count_max) {
            count_max = count;
        }
    }

    return count_max;
}