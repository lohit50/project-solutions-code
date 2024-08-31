void moveZeroes(int* nums, int n) {
    int count = 1;
    for(int i=0;i<n;i++){
        if(nums[i] == 0){
           for(int j=n-1;j>i;j--){
            if(nums[j] != 0){
                int temp = nums[j];
                nums[j] = nums[i];
                nums[i] = temp;
            }
          }
       }
    }
}