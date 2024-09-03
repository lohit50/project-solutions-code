int countSeniors(char ** details, int n){
    int count = 0;
    for(int i=0;i<n;i++){
        if(((details[i][11]-'0')*10 + (details[i][12]-'0')) > 60){
            count++;
        }
    }
    return count;
}