class Solution {

    public static void Generate(int n,int numOpen, int numClose, List<String> list, String temp){
        if(numOpen == n && numClose == n){
            list.add(temp + "");
            return;
        }  
        if(numClose < numOpen){
            Generate(n,numOpen,numClose + 1,list,temp + ")");
            
        }
        if(numOpen < n){
            Generate(n,numOpen + 1,numClose,list,temp + "(");
        }
    }


    public List<String> generateParenthesis(int n) {
        List<String> list = new ArrayList<>();
        String temp = "(";
        int numOpen = 1;
        int numClose = 0;
        Generate(n,numOpen,numClose,list,temp);
        
        return list;
    }
}