int addedInteger(int* nums1, int nums1Size, int* nums2, int nums2Size) {
    int sumDiff = 0;
    for(int i=0;i<nums1Size;i++){
        sumDiff+= nums2[i]-nums1[i];
    }
    return sumDiff/nums1Size;
}