
class Solution {
    public String mergeAlternately(String word1, String word2) {
        int n1 = word1.length();
        int n2 = word2.length();

        char[] ch1 = word1.toCharArray();
        char[] ch2 = word2.toCharArray();

        String str = "";
        int i = 0;

        while (i < n1 || i < n2) {
            if (i < n1) {
                str += ch1[i];
            }
            if (i < n2) {
                str += ch2[i];
            }
            i++;
        }

        return str;
    }
}
