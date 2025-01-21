class Solution {
    public boolean isValid(String s) {
        Stack<Character> S = new Stack<>();

        for(char Symbol : s.toCharArray()){
            if(!S.isEmpty() && (
                (Symbol == ')' && S.peek() == '(')||
                (Symbol == '}' && S.peek() == '{')||
                (Symbol == ']' && S.peek() == '['))){
                    S.pop();
                }
                else{
                    if(Symbol == '}' || Symbol ==  ')' || Symbol == ']') return false;
                    S.push(Symbol);
                }
            }
        if(!S.isEmpty()){
            return false;
        }
        return true;
    }
}