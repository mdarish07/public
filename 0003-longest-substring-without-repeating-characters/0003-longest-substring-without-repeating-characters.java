class Solution {
    public int lengthOfLongestSubstring(String s) {
        int PossibleCharacters[]=new int[256];
        int i=0,j=0,n=s.length();
        int MaxLength=0;
        while(j<n){
            char currChar=s.charAt(j);
            int currCharAscii=(int)currChar;
            PossibleCharacters[currCharAscii]+=1;
            while(PossibleCharacters[currCharAscii]>1){
                char leftChar=s.charAt(i);
                int leftCharAscii=(int)leftChar;
                PossibleCharacters[leftCharAscii]-=1;
                i++;
            }
            int WindowSize=j-i+1;
            MaxLength=(int)Math.max(MaxLength,WindowSize);
            j++;
        }
        return MaxLength;
    }
}