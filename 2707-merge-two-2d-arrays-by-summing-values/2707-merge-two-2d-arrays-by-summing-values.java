import java.util.*;

class Solution {
    public int[][] mergeArrays(int[][] nums1, int[][] nums2) {
        int merged[][] = new int[nums1.length + nums2.length][2];
        int i = 0, index = 0;

        // Merge nums1 and nums2 into merged array
        while (index < nums2.length + nums1.length) {
            if (index < nums1.length) {
                merged[i++] = nums1[index];
            } else {
                merged[i++] = nums2[index - nums1.length];
            }
            index++;
        }

        // Sort merged array by the first column
        Arrays.sort(merged, (a, b) -> Integer.compare(a[0], b[0]));

        System.out.println("Before Merging Duplicates: " + Arrays.deepToString(merged));

        // New array for storing the merged values (without duplicates)
        int[][] temp = new int[merged.length][2];
        int newIndex = 0;

        // Merge duplicates
        for (i = 0; i < merged.length - 1; i++) {
            if (merged[i][0] == merged[i + 1][0]) {
                merged[i + 1][1] =  merged[i+1][1] + merged[i][1];
            } else {
                temp[newIndex++] = merged[i];
            }
        }

        temp[newIndex++] = merged[merged.length - 1];

        int[][] result = Arrays.copyOf(temp, newIndex);


        return result;
    }
}
