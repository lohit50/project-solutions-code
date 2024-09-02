
char* longestPalindrome(char* s) {
    int n = strlen(s);
    int start = 0;
    int maxlen = 1;
    for(int i=0;i<n;i++){
        for(int j=0;j<2;j++){
            int left = i;
            int right = i+j;
            while(left>=0 && right<n && s[right] == s[left]){
                if(right-left+1 > maxlen){
                    maxlen = right-left+1;
                    start = left;
                }
                left--;
                right++;
            }
        }
    }
    s[start+maxlen] = '\0';
    return s+start;
}