/**
 * Note: The returned array must be malloced, assume caller calls free().
 */
int* productExceptSelf(int* nums, int numsSize, int* returnSize) {
    int left[numsSize];
    int right[numsSize];
    int l_mult = 1;
    int r_mult = 1;

    for(int i=0;i<numsSize;i++){
        int j = numsSize-1-i;
        left[i] = l_mult;
        right[j] = r_mult;
        l_mult *= nums[i];
        r_mult *= nums[j];
    }
    int* res = (int*)malloc((numsSize+1)*sizeof(int));
    for(int i=0;i<numsSize;i++){
        res[i] = left[i] * right[i];
    }
    *returnSize = numsSize;
    return res;
}