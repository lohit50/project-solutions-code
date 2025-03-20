class Solution {
    
    // This method packages words into lines (already provided)
    public static void Packages(StringBuilder whole, List<String> packages, int maxWidth) {
        int index = 0;
        int last_valid = 0;
        int count = 0;
        int start = 0;
        while (index < whole.length()) {
            // If it's the first character, last character, or the next char is a space
            if (index == 0 || index + 1 == whole.length() || whole.charAt(index + 1) == ' ') {
                last_valid = index;
            }
            count++;
            if (count == maxWidth || index + 1 == whole.length()) {
                if (last_valid == index) {
                    packages.add(whole.substring(start, index + 1));
                    start = index + 2;
                    index++;
                    count = 0;
                } else {
                    packages.add(whole.substring(start, last_valid + 1));
                    start = last_valid + 2;
                    index = last_valid + 1;
                    count = 0;
                }
            }
            System.out.println(packages);
            index++;
        }
    }
    
    // This function fills each package with spaces to reach maxWidth using mathematical distribution of spaces.
    public static void SpaceIt(List<String> packages, int maxWidth, List<String> ans) {
        for (int i = 0; i < packages.size(); i++) {
            String line = packages.get(i);
            // Split the line by single space (we expect the package lines to have words separated by a single space)
            String[] words = line.split(" ");
            
            // For the last line, left-justify
            if (i == packages.size() - 1) {
                String result = String.join(" ", words);
                int spacesToAdd = maxWidth - result.length();
                StringBuilder sb = new StringBuilder(result);
                for (int k = 0; k < spacesToAdd; k++) {
                    sb.append(" ");
                }
                ans.add(sb.toString());
            } else {
                // If only one word is in the line, left-justify by appending spaces to the right.
                if (words.length == 1) {
                    String result = words[0];
                    int spacesToAdd = maxWidth - result.length();
                    StringBuilder sb = new StringBuilder(result);
                    for (int k = 0; k < spacesToAdd; k++) {
                        sb.append(" ");
                    }
                    ans.add(sb.toString());
                } else {
                    // Fully justify: distribute spaces evenly between words.
                    int totalLetters = 0;
                    for (String w : words) {
                        totalLetters += w.length();
                    }
                    int totalSpaces = maxWidth - totalLetters;
                    int gaps = words.length - 1;
                    int evenSpaces = totalSpaces / gaps;
                    int extraSpaces = totalSpaces % gaps;
                    
                    StringBuilder sb = new StringBuilder();
                    for (int j = 0; j < words.length; j++) {
                        sb.append(words[j]);
                        if (j < gaps) {
                            // Distribute one extra space to the left gaps as needed.
                            int spacesToApply = evenSpaces + (j < extraSpaces ? 1 : 0);
                            for (int s = 0; s < spacesToApply; s++) {
                                sb.append(" ");
                            }
                        }
                    }
                    ans.add(sb.toString());
                }
            }
        }
    }
    
    public List<String> fullJustify(String[] words, int maxWidth) {
        // Join words into a single string separated by space
        StringBuilder whole = new StringBuilder(String.join(" ", Arrays.asList(words)));
        System.out.println(whole.toString());
        
        List<String> ans = new ArrayList<>();
        List<String> packages = new ArrayList<>();
        
        // Packing words into lines that have maxWidth or less
        Packages(whole, packages, maxWidth);
        
        // Distribute extra spaces in each packaged line to get full justification
        SpaceIt(packages, maxWidth, ans);
        
        return ans;
    }
    
}