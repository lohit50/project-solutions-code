int addedInteger(int* nums1, int n1, int* nums2, int n2) {
    int sum = 0;
    for(int i=0;i<n1;i++) sum+= nums2[i]-nums1[i];
    
    return sum/n2;
}