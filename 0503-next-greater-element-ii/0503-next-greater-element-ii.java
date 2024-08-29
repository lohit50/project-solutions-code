class Solution {
    public int[] nextGreaterElements(int[] arr1) {
        int n = arr1.length;
        int[] arr2 = new int[arr1.length * 2];
        System.arraycopy(arr1, 0, arr2, 0, arr1.length);
        System.arraycopy(arr1, 0, arr2, arr1.length, arr1.length);
        
        int[] result = new int[arr1.length];
        for (int i = 0; i < n; i++) {
            int flag = 0;
            for (int j = i; j < i + n; j++) {
                if (arr2[j] > arr1[i]) {
                    result[i] = arr2[j];
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
