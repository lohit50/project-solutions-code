
bool canJump(int* nums, int numsSize) {
    for (int i = 0; i < numsSize; i++) {
        if (i > nums[0]) {
            return false;  
        }
        if (i + nums[i] > nums[0]) {
            nums[0] = i + nums[i]; 
        }
    }
    return true;
}
