class Solution {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int container = 0;
        // while(left <= height.length - 1){
        //     if(right == height.length){
        //         left++;
        //         right = left;
        //         continue;
        //     }
        //     container = Math.max(container , ((right - left)) * Math.min(height[left],height[right]));
        //     right++; 
        //     System.out.println(left +" - "+ right);
        //     System.out.println( );
        // }
        while(left <= right){
            container = Math.max(container, (right - left) * Math.min(height[left] , height[right]));
            if(height[right] > height[left]) left++;
            else if(height[right] < height[left]) right--;
            else if(height[left] == height[right]){
                left++;
                right--;
            }
        }
        return container;
    }
}