bool isHappy(int num) {
    int temp = num;
    int sum = 0;
    while(true){
        sum = 0;
        int digits = log10(temp) + 1;
        for(int i=0;i<digits;i++){
            sum += pow(temp%10,2);
            temp /= 10;
        }
        if(sum == 1) return true;
        if(sum == 4 || sum == 2) return false;
        temp = sum;
    }
}