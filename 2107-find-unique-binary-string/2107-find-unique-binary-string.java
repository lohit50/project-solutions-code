class Solution {
    public static void Permutation(Set<String> set, StringBuilder temp, StringBuilder result){
        if(temp.length() == set.size()){
            System.out.println(temp.toString());
            if( ! set.contains(temp.toString())){
                result.append(temp.toString());
                return;
            }
            return;
        }
        for(int i = 0; i < 2 && result.length() == 0; i++){
            temp.append(Integer.toString(i));
            Permutation(set ,temp, result);
            temp.deleteCharAt(temp.length() - 1);
        }
    }

    public String findDifferentBinaryString(String[] nums) {
        StringBuilder temp = new StringBuilder();
        Set<String> set = new HashSet<>(Arrays.asList(nums));
        StringBuilder result = new StringBuilder();
        Permutation( set, temp , result);
        return result.toString();
    }

}