class Solution {

    private String str = "1";

    public String countAndSay(int n) {
        return result(n);
    }

    public String result(int n){
        if(n == 1) return str;

        StringBuilder sb = new StringBuilder();
        int count = 1;

        for(int i = 1 ; i < str.length(); i++){
            if(str.charAt(i) == str.charAt(i-1)) count++;
            else{
                sb.append(count).append(str.charAt(i-1));
                count = 1;
            }
        }
        sb.append(count).append(str.charAt(str.length() - 1));
        str = sb.toString();
        return result(n-1);
    }
}