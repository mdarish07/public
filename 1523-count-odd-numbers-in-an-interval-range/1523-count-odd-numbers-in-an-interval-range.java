class Solution {
    public int countOdds(int low, int high) {
      /*  int c=0;
       for(int i=low;i<=high;i++){
            if(i%2==1){
                c++;
            }
        }
        return c;
        */
        return (high+1)/2-(low/2);// (high+1)/2 ---> up to 0 to high then find low to high to simply think about remove 0 to low so formula become this....
    }
}  
