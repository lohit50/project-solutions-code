bool isValid(char* para) {
    int m=strlen(para);
   char temp2;
   
   for(int i=0;i<m;i++){
       if(para[i] == '}' || para[i] == ')' || para[i] == ']'){
           char temp = para[i];
           if(temp == '}'){
               temp2 = '{';
           }if(temp == ']'){
               temp2 = '[';
           }if(temp == ')'){
               temp2 = '(';
           }
           int n=1;
            for(int j=i-1;n==1 && j>= 0;j--){
                if(para[j] == '*'){
                    continue;
                }
                else if(temp2 == para[j]){
                    para[i] = '*';
                    para[j] = '*';
                    n--;
                }
                else if(para[j] == '{' || para[j] == '(' || para[j] == '['){
                    return false;
                }
             }
           }
       }
       
       for(int i=0;i<m;i++){
           if(para[i] != '*'){
               return false;
           }
       }
       return true;
}