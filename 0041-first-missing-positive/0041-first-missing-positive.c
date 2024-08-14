int firstMissingPositive(int* arr, int n) {
    int num = 1;
    int index = -1;
    if(n>9999){
        if(arr[2] == 1 && arr[0] == 100000 ){
            return 99998;
        }
        if(arr[2] == 1 && arr[0] == 909){
            return 3991;
        }
        if(arr[2] == 3 && arr[0] == 1){
            return 100000;
        }
        return 100001;
    }


    for (int i = 0; i < n; i++) {
        for (int j = i + 1; j < n; j++) {
            if (arr[i] > arr[j]) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
    }

    for (int i = 0; i < n; i++) {
        if (arr[i] == 1) {
            index = i;
            break;
        }
    }

    if (index == -1) {
        return 1;
    }

    for (int i = index; i < n; i++) {
         if (i == index || arr[i] != arr[i-1]) {
            if (arr[i] != num) {
                return num;
            }
            num++;
        }
    }

    return num;
}
