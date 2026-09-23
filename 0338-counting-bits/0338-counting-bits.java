class Solution {
    public int CountBit(int num){
        int c=0;
        while(num!=0){
            if(num%2==1){
            c++;
            }
            num/=2;
        }
        return c;
    }
    public int[] countBits(int n) {
        int res[]=new int[n+1];
        for(int i=0;i<n+1;i++){
           res[i]=CountBit(i);
        }
          return res;
    } 
}