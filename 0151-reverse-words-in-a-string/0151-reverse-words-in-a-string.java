class Solution {
    public String reverseWords(String s) {
        ArrayList<String> sen = new ArrayList();
        StringBuilder word = new StringBuilder();
        int index = 0;
        while(index < s.length()){
            if(s.charAt(index) != ' ') word.append(s.charAt(index));
            if(index + 1 == s.length() || ( s.charAt(index) == ' ' && s.charAt(index+1) != ' ' )){
                if(word.length() > 0){
                    sen.add(word.toString());
                    word.setLength(0);
                }
            }
            index++;
        }
        // System.out.println(word.toString());
        // System.out.println(sen);
        Collections.reverse(sen);
        return String.join(" ", sen);
    }
}