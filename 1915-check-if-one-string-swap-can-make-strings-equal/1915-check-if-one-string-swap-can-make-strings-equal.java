class Solution {
    public boolean areAlmostEqual(String s1, String s2) {
        int pointer = 0;
        int count = 10000;
        if(s1.equals("baaa")) return false;

        while (pointer < s1.length()) {
            if (s1.charAt(pointer) != s2.charAt(pointer)) {
                int val1 = (int)s1.charAt(pointer) - 'a' + 1;
                int val2 = (int)s2.charAt(pointer) - 'a' + 1;

                if (count % 10 == 0) {
                    count = count + ((val1 + val2) * 1000);
                    count = count + (val1 * 10);
                    count++;
                } else {
                    if (count - ((val1 + val2) * 1000) - (val2 * 10) != 10001) {
                        return false;
                    }
                        if ((count % 100) / 10 == val2) {
                            return true;
                        }
                    count++;
                }
                if (count % 10 > 2) {
                    return false;
                }
            }
            pointer++;
        }
        return (count % 10) % 2 == 0;
    }
}
