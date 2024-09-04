int addedInteger(int* nums1, int n1, int* nums2, int n2) {
    int sum1 = 0;
    int sum2 = 0;
    for(int i=0;i<n1;i++){
        sum1+=nums1[i];
    }
    for(int i=0;i<n2;i++){
        sum2+=nums2[i];
    }
    return (sum2-sum1)/n2;
}