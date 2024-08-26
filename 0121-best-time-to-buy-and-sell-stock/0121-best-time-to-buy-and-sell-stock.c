#include <limits.h>

int maxProfit(int* arr, int n) {
    int min = INT_MAX;
    int maxProfit = 0;

    for (int i = 0; i < n; i++) {
        if(min>arr[i]){
            min = arr[i];
        }
        else if(arr[i] - min > maxProfit) {
            maxProfit = arr[i] - min;
        }
    }

    return maxProfit;
}
