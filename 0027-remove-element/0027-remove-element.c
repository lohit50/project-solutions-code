int removeElement(int* arr, int n, int val) {
    int i = 0;
    while (i < n) {
        if (arr[i] == val) {
            arr[i] = arr[--n]; 
        } else {
            i++; 
        }
    }
    return n;
}
