class Solution {
    public int titleToNumber(String ct) {
     int n=ct.length();
     int ans=0,p=0;
     for(int i=n-1;i>=0;i--){
        char ch=ct.charAt(i);
       int val = ch-'A'+1;
            ans += val*(int) Math.pow(26,p++);
     }
     return ans;
    }
}
