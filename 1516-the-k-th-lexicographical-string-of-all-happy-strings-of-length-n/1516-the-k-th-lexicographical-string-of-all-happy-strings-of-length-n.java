class Solution {
    public static void Generate(int n,int[] count, StringBuilder result, List<String> list){
        if(result.length() == n){
            list.add(result.toString());
             count[0]--; // Decrement count
            if (count[0] == 0) return; // Stop when we reach the k-th string
            System.out.println(result.toString());
            return;
        }
        for(char ch : new char[]{'a','b','c'}){
            if(result.charAt(result.length() - 1) != ch){
                result.append(ch);
                Generate(n,count,result,list);
                 if (count[0] == 0) return; // Stop recursion when k-th string is found
                result.deleteCharAt(result.length() -1);
            }
        }
    }
    
    public String getHappyString(int n, int k) {
        int each_size = (int)Math.pow(2,(n-1));
        int k_location = (k-1)/each_size;

        if(k_location > 2) return "";

        StringBuilder result = new StringBuilder();
        List<String> list = new ArrayList<>();

        result.append((char)(k_location + 97));
        int[] count = {k - (k_location * each_size)};
        Generate(n,count,result,list);

        return result.toString();
    }

}