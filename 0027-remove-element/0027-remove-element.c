int removeElement(int* arr, int n, int val) {
    int k=0;
    for(int i=0;i<n;i++){
        if(arr[i] != val){
            arr[k++] = arr[i];
        }
    }

    return k;
}