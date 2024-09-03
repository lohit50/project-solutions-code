int getLucky(char* s, int k) {
    int sum = 0;
    int total = 0;
    int n = strlen(s);
    for(int i=0;i<n;i++){
        if((s[i]-'`')>9){
            int num =(s[i]-'`');
            while(num>0){
                sum+=num%10;
                num/=10;
            }
        }
        else{
            sum+=(s[i]-'`');
        }
    }
    if(k==1){
        return sum;
    }else{
        for(int i=1;i<k;i++){
            total = 0;
            while(sum>0){
                total += sum%10;
                sum/=10;
            }
            sum = total;
        }
    }
    return total;
}