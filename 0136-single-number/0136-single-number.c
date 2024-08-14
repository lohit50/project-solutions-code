int singleNumber(int* arr, int n) {
    int number[100000] = {0};
    int minus_number[100000] = {0};
    int j;
    for(int i=0;i<n;i++){
        if(arr[i]>=0){
            number[arr[i]]++;
        }else{
            minus_number[abs(arr[i])]++;
        }
    }
    
    for(int i=0;i<100000;i++){
        if(minus_number[i] == 1){
            j=i*(-1);
        }   
    }
    for(int i=0;i<100000;i++){
        if(number[i] == 1){
            j=i;
        }
    }
    return j;
}