class Solution {
    public int arrangeCoins(int n) {
       int rowC=0;
       while(n>0){
        rowC++;
        n=n-rowC;
       }
       return n==0?rowC:rowC-1;
    }
}