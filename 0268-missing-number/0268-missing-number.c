int missingNumber(int* arr, int n) {
    int dup[n+1];
    int result = 0;
    for(int i=0;i<n+1;i++){
        dup[i] = 0;
    }
    for(int i=0;i<n;i++){
        dup[arr[i]]++;
    }
    for(int i=0;i<n+1;i++){
        if(dup[i] == 0){
            result = i;
        }
    }
    return result;
}