class Solution {

    public Boolean vowel(Character letter){
        if(letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u' ||
           letter == 'A' || letter == 'E' || letter == 'I' || letter == 'O' || letter == 'U' ){
                return true;
           }
        return false;
    }

    public String reverseVowels(String s) {
        StringBuilder string = new StringBuilder(s);
        
        int left = 0;
        int right = string.length() - 1;

        while(left < right){
            if(vowel(string.charAt(left)) && vowel(string.charAt(right))){
                char temp = string.charAt(left);
                string.setCharAt(left, string.charAt(right));
                string.setCharAt(right, temp);
                System.out.print("lohit");
                left++;
                right--;
            }else if(! vowel(string.charAt(left))){
                left++;
            }else{
                right--;
            }
        }
        return string.toString();
    }
}