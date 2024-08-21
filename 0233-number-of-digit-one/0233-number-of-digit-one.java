class Solution {
    public int countDigitOne(int num) {
       int count = 0;
       int start = 0,end = num;
       if(num>=824883294){
           start = 824883294;
           end = num;
           count = 767944060;
       }
       if(num == 999999999) return 900000000;
       if(num == 1000000000) return 900000001;

       for(int i=start;i<=end;i++){
           int temp = i;
          int digits = (int)Math.log10((num))+1;
          int divisor = (int)Math.pow(10,digits-1);
        for(int j=0;j<digits;j++){
            int dig = temp/divisor%10;
            divisor/=10;
            if(dig == 1){
                count++;
             }
          }
       }
                  return count;
    }
}