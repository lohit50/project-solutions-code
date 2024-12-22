class Solution {
    public boolean canConstruct(String ranstr, String magstr) {
        int number = 0;
        StringBuilder ran = new StringBuilder(ranstr);
        StringBuilder mag = new StringBuilder(magstr);
        for(int i=0;i<ran.length();i++){
            boolean found= false;
                for(int j=0;j<mag.length();j++){
                    if(ran.charAt(i) == mag.charAt(j)){
                        ran.setCharAt(i,'*');
                        mag.setCharAt(j,'*');
                        number++;
                        found = true;
                        break;
                    }
                }
                if(!found){
                    return false;
                }
        }
        return  number == ran.length();
    }
}