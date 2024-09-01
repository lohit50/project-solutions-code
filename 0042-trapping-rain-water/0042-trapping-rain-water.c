int trap(int* height, int n) {
    int traped = 0;
    for (int i = n - 1; i > 0; i--) { 
        int greatest = -1;
        int last_index = 0;

        for (int j = i - 1; j >= 0; j--) {
            if (height[j] > greatest) {
                greatest = height[j];
                last_index = j;
            }
            if (height[j] >= height[i]) {
                greatest = height[i];
                last_index = j;
                break;
            }
        }
        if (greatest > 0) {
            for (int k = last_index + 1; k < i; k++) {
                traped += greatest - height[k];
            }
        }
        i = last_index+1;
    }
    
    return traped;
}