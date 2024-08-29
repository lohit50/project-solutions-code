class Solution {
    public int[] nextGreaterElement(int[] arr1, int[] arr2) {
        int[] result = new int[arr1.length];
        int flag = 0;
        int index = 0;
        for(int i=0;i<arr1.length;i++){
            for(int j=0;j<arr2.length;j++){
                if(arr2[j] == arr1[i]){
                    flag = 1;
                }
                if(flag == 1){
                    if(arr2[j]>arr1[i]){
                        result[index++] = arr2[j];
                        flag = 0;
                    }
                }
                if(j==arr2.length-1 && flag == 1){
                    result[index++] = -1;
                }
            }
            flag = 0;
        }

        return result;

    }
}