class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> S = new Stack<>();
        for(String Char : tokens){
            if(Char.equals("+") || Char.equals("-") || Char.equals("*") || Char.equals("/")){
                int number1 = S.pop();
                int number2 = S.pop();
                int temp = 0;
                if(Char.equals("+")) temp = number2 + number1;
                if(Char.equals("-")) temp = number2 - number1;
                if(Char.equals("*")) temp = number2 * number1;
                if(Char.equals("/")) temp = number2 / number1;
                S.push(temp);
            }else{
                S.push(Integer.parseInt(Char));
            }
        }
        return S.pop();
    }
}