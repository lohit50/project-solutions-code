class Solution {
    public int numberOfAlternatingGroups(int[] colors, int k) {
     int total = 0;
     int left = 0;   
     int right = 1;  
    while(left < colors.length){
            if(colors[(right - 1) % colors.length] == colors[right % colors.length]){
                left = right;
            }
            if(right - left + 1 == k){
                total++;
                left++;
            }
            right++;
        }  
        return total;
    }
}