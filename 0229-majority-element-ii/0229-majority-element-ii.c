int* majorityElement(int* arr, int n, int* returnSize) {
    int* result = (int*)malloc(n * sizeof(int)); 
    int resultIndex = 0;
    int temp = 0;

    for (int i = 0; i < n; i++) {
        int count = 0;
        if(arr[i] == INT_MIN){
            continue;
        }
        for (int j = 0; j < n; j++) {
            if (arr[i] == arr[j]) {
                count++;
                temp = arr[i];
                if(count>1) arr[j] = INT_MIN;
            }
        }
        if (count > n / 3) {
           result[resultIndex++] = temp;
        }
    }

    *returnSize = resultIndex;
    return result;
}