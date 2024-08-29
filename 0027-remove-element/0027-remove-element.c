int removeElement(int* arr, int n, int val) {
    int k=0;
    for(int i=0;i<n;i++){
        if(arr[i] != val){
            k++;
        }else{
            arr[i] = -998;
        }
    }
    for(int i=0;i<n;i++){
        for(int j=0;j<n-1;j++){
            if(arr[j] == -998){
                int temp = arr[j+1];
                arr[j+1] = arr[j];
                arr[j] = temp;
            }
        }
    }

    return k;
}