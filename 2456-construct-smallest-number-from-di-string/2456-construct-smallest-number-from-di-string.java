class Solution {
    public String smallestNumber(String pattern) {
        StringBuilder result = new StringBuilder("*".repeat(pattern.length() + 1));
        System.out.println(result.toString());
        int number = pattern.length() + 1;
        int index = pattern.length();
        int fill = 0;
        int first_I = pattern.length();
        
        for(int i = pattern.length() - 1 ; i >= 0; i--){
            if(i == 0 || pattern.charAt(i) == 'I'){
                fill = 1;
                if(pattern.charAt(i) == 'I'){
                    first_I = i;
                }
            }
            if(fill == 1){
                index = i+1;
                for(int j = index; j <= pattern.length(); j++){
                    if(result.charAt(j) == '*'){
                        result.replace(index,index+1,Integer.toString(number--));
                        index++;
                    }
                }
                fill = 0;
            }
        }
        result.deleteCharAt(0);
        result.insert(first_I,Integer.toString(1));
        System.out.println(result.toString());
        return result.toString();
    }
}