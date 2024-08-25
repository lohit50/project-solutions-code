int searchInsert(int* arr, int n, int target) {
    for(int i=0;i<n;i++){
        if(target<=arr[i]){
            return i;
        }
    }
    return n;
}