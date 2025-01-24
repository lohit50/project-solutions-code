class Solution {
    public int[] decrypt(int[] code, int k) {
        int times = 0;
        int sum = 0;
        int index = 0;
        int[] result = new int[code.length];
        int res_index = 0;
        for(int j = 0; j < code.length; j++){
            if(k == 0) code[j] = 0;
            else if( k > 0){
                index = j+1;
                while(times < k){
                    if(index == code.length){
                        index = 0;
                    }
                    sum += code[index++];
                    times++;
                    
                }
                result[res_index++] = sum;
                sum = 0;
                times = 0;
            }else{
                index = j-1;
                while(times < -k){
                    if(index == -1){
                        index = code.length - 1;
                    }
                    sum += code[index--];
                    times++;
                }
                result[res_index++] = sum;
                sum = 0;
                times = 0;
            }
        }
        return result;
    }
}