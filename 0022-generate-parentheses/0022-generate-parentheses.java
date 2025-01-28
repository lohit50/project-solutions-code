class Solution {

    public static void Generate(int n, int numOpen, int numClose, String temp, List<String> list){
        if(numOpen == n && numClose == n){
            list.add(temp + "");
            return;
        }
        if(numClose < numOpen){
            Generate(n, numOpen, numClose + 1, temp+")" , list);
        }
        if(numOpen < n){
            Generate(n, numOpen + 1, numClose, temp+"(" , list);
        }
    }



    public List<String> generateParenthesis(int n) {
        List<String> list = new ArrayList<>();
        String str = "(";
        int numOpen = 1;
        int numClose = 0;
        Generate(n,numOpen,numClose,str,list);
        return list;
    }
}