void sortColors(int* nums, int n) {
    int count[3] = {0};
    for(int i=0;i<n;i++){
        count[nums[i]]++;
    }
    int j=0;
    for(int i=0;i<3;i++){
        while(count[i]--){
            nums[j++] = i;
        }
    }
}