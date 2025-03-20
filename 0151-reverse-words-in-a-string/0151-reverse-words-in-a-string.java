class Solution {
    public String reverseWords(String s) {
        ArrayList<String> sen = new ArrayList();
        StringBuilder word = new StringBuilder();
        int index = 0;
        while(index < s.length()){
            if(index == s.length() - 1){
                if(s.charAt(index) != ' '){
                    word.append(s.charAt(index));
                    sen.add(word.toString());
                }
            }
            if(s.charAt(index) == ' '){
                if( word.length() > 0 ){
                    sen.add(word.toString());
                    word.setLength(0);
                }
            }
            else{
                word.append(s.charAt(index));
            }
        // System.out.println(word.toString());
        // System.out.println(sen);

        index++;
        }
        Collections.reverse(sen);
        return String.join(" ", sen);
    }
}