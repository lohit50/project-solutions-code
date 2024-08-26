int findPeakElement(int* arr, int n) {
    int i=0;
    if(n==3){
        if(arr[0]>arr[1]) return 0;
        else if(arr[2]>arr[1]) return 2;
        else return 1;
    }
    if(n<=2){
        if(n==1) return 0;
        if(arr[0] > arr[1]) return 0;
        else return 1;
    }
    for(i=0;i<n;i++){
        if(arr[n-1]>arr[n-2]) return n-1;
        if(arr[0]>arr[1]) return 0;
        if(i>=1 && i<n-1){
            if(arr[i]>arr[i-1] && arr[i]>arr[i+1]){
                return i;
            }
        }
    }
    return i;
}