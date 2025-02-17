class Solution {
    public static void Generate(int n,List<String> list, StringBuilder temp, int open, int close){
        if(temp.length() == n * 2){
            list.add(temp.toString());
            return;
        }
        if(open < n){
            temp.append("(");
            open += 1;
            Generate(n,list,temp,open,close);
            open -= 1;
            temp.deleteCharAt(temp.length() - 1);
        }
        if(close < open){
            temp.append(")");
            close += 1;
            Generate(n,list,temp,open,close);
            close -= 1;
            temp.deleteCharAt(temp.length() - 1);
        }
    }

    public List<String> generateParenthesis(int n) {
       List<String> list = new ArrayList<>();
       StringBuilder temp = new StringBuilder();
       int open = 0;
       int close = 0;
       Generate(n,list,temp,open,close);
       return list;
    }

}