class Solution {
    public boolean isValid(String word) {
        boolean vowel = false;
        String vowels = "aeiouAEIOU";
        boolean consonant = false;
        if(word.length() < 3) return false;
        for(int i = 0; i < word.length(); i++){
            char letter = word.charAt(i);
            if(!Character.isLetterOrDigit(letter)) return false;
            if(!Character.isDigit(letter)){
                if(vowel == false && vowels.indexOf(letter) != -1) vowel = true;
                if(consonant == false && vowels.indexOf(letter) == -1) consonant  = true;
            }
        }
        return vowel && consonant;
    }
}