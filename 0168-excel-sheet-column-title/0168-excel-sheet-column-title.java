class Solution {
    public String convertToTitle(int cn) {
       StringBuilder sb=new StringBuilder();
       while(cn>0){
        cn--;
        sb.append((char)(cn%26+'A')); // 'A'=65
        cn/=26;
       }
       return sb.reverse().toString();
    }
}