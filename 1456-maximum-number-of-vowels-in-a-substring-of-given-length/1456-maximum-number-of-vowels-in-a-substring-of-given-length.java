class Solution {
public boolean isVowel(char ch){
    return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
}
    public int maxVowels(String s, int k) {
           int n=s.length();
       int i=0,j=0;
       int c=0,max=0;
       while(j<n){
        if(isVowel(s.charAt(j)))
           c++;
       if(j-i+1==k){
       max=(int)Math.max(c,max);
       if(isVowel(s.charAt(i))){
         c--;}
         i++;
       }
       j++;
       }
 return max;
    }
}