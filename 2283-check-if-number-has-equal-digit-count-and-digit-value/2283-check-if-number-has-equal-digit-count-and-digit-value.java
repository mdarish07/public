class Solution {
    public boolean digitCount(String num) {
        int c[]=new int[10];
       for(char ch: num.toCharArray()){
        c[ch-'0']++;
    }
    for(int i=0;i<num.length();i++){
        if(c[i] != num.charAt(i) - '0') {
                return false;
            }
    }
    return true;
}
}