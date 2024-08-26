bool canJump(int* arr, int n) {
    int jumped = 0;

    for (int i = 0; i < n; i++) {
        if (i > jumped) {
            return false;
        }

        if (i + arr[i] > jumped) {
            jumped = i + arr[i];
        }

        if (jumped >= n - 1) {
            return true;
        }
    }

    return false;
}
