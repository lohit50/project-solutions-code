int strStr(char* arr1, char* arr2) {
    int n1 = strlen(arr1);
    int n2 = strlen(arr2);
     
    for(int i=0;i<n1;i++){
        int j = 0;
        for(j=0;j<n2;j++){
            if(arr1[i+j]!=arr2[j]){
                break;
            }
        }
        if(j==n2){
            return i;
        }
    }
    return -1;
}