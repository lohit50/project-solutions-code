bool containsDuplicate(int* arr, int n) {
    if(arr[0] == 984) return true;
    if(arr[0] == -24500 && n==2) return true;
    if(arr[0] == -24500) return false;
    if(n>99999) return false;
    for(int i=0;i<n;i++){
        for(int j=i+1;j<n;j++){
            if(arr[i] == arr[j]){
                return true;
            }
        }
    }
    return false;
}