int getLucky(char* s, int k) {
    int sum = 0;
    int total = 0;
    int n = strlen(s);
    for(int i=0;i<n;i++){
        int value = (s[i]-'a'+1);
        sum += value/10 + value%10;
    }
    while(--k>0){
        sum = sum/1000 + (sum/100)%10 + (sum/10)%10 + sum%10;
    }
    return sum;
}