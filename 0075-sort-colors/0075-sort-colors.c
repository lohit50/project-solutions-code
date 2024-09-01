void sortColors(int* nums, int n) {
    int zero = 0;
    int two = 0;
    int one = 0;
    for(int i=0;i<n;i++){
        if(nums[i] == 0){
            zero++;
        }
        if(nums[i] == 1){
            one++;
        }
        if(nums[i] == 2){
            two++;
        }
    }
    for(int i=0;i<n;i++){
        if(zero){
            nums[i] = 0;
            zero--;
        }else if(one){
            nums[i] = 1;
            one--;
        }else if(two){
            nums[i] = 2;
            two--;
        }
    }
}