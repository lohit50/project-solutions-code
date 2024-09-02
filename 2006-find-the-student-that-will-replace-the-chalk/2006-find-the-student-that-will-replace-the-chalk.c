int chalkReplacer(int* chalk, int n, int k) {
    long sum = 0;
    for(int i=0;i<n;i++){
        sum+=chalk[i];
    }
    long remain = k%sum;
    for(int i=0;i<n;i++){
        remain -= chalk[i];
        if(remain<0){
            return i;
        }
    }
    return 0;
}