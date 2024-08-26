int majorityElement(int* arr, int n) {
    int number = 0;
    int count = 0;
    for(int i=0;i<n;i++){
        if(count == 0){
            number = arr[i];
        }
        if(number == arr[i]){
            count++;
        }else{
            count--;
        }
    }
    return number;
}