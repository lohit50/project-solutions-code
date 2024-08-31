void expand(char* s,int left,int right,int *start,int* maxlen){
    int len = strlen(s);
    while(left>=0 && right<len && s[left] == s[right]){
        if(right-left+1 > *maxlen){
            *maxlen = right-left+1;
            *start = left;
        }
        left--;
        right++;
    }
}

char* longestPalindrome(char* s) {
    int len = strlen(s);
    int start = 0;
    int maxlen = 1;
    for(int i=0;i<len;i++){
        expand(s,i,i,&start,&maxlen);
        expand(s,i,i+1,&start,&maxlen);
    }

    char* result = (char*)malloc((maxlen+1) * sizeof(char));
    strncpy(result,s+start,maxlen);
    result[maxlen] = '\0';

    return result;
}