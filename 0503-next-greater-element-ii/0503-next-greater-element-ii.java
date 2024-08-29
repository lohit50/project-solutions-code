class Solution {
    public int[] nextGreaterElements(int[] arr1) {
        int n = arr1.length;
        int[] result = new int[n];
        
        for (int i = 0; i < n; i++) {
            int flag = 0;
            for (int j = i; j < i + n; j++) {
                int index = j % n;
                if (arr1[index] > arr1[i]){
                    result[i] = arr1[index];
                    flag = 1;
                    break;
                }
            }
            if (flag != 1) {
                result[i] = -1;
            }
        }
        
        return result;
    }
}
