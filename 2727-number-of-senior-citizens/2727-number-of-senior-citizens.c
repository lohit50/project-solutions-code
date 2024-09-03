int countSeniors(char ** details, int n){
    int count = 0;
    for(int i=0;i<n;i++){
        if(details[i][11] > '6' || details[i][11]=='6' && details[i][12]>'0'){
            count++;
        }
    }
    return count;
}