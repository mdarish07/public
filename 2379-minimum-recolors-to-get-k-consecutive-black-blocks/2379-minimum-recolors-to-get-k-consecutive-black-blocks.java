class Solution {
    public int minimumRecolors(String blocks, int k) {
        int i=0,j=0,n=blocks.length();
        int White=0,min=Integer.MAX_VALUE;
        while(j<n){
            if(blocks.charAt(j)=='W'){
               White++;  
            }
            if(j-i+1==k){
            min=(int)Math.min(min,White);
            if(blocks.charAt(i)=='W') {
            White--; 
               }
          i++;
           }
           j++;
        }
        return min;
    }
}