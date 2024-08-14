double findMedianSortedArrays(int* arr1, int n1, int* arr2, int n2) {
        int max_n = n1+n2;
    int flag = 0,j=-1;
    int joint[n1+n2];
    for(int i=0;i<max_n;i++){
        j++;
        if(i<n1){
            joint[i] = arr1[j];
            if(i==n1-1){
                flag = 1;
                j=-1;
            }
        }else if(j<n2){
            joint[i] = arr2[j];
        }
    }
    
   for(int i=0;i<max_n;i++){
       for(int j=i+1;j<max_n;j++){
           if(joint[i]>joint[j]){
               int temp = joint[j];
               joint[j] = joint[i];
               joint[i] = temp;
           }
       }
   }
    if(max_n==1){
        if(n1 == 1){
            return arr1[0];
        }else{
            return arr2[0];
        }
    }
   double result = 0.00;
   if(max_n%2!=0){
       result = joint[(max_n/2)];
   }else{
       result = (float)(joint[max_n/2] + (joint[(max_n/2)-1]))/2;
   }
    return result;
}