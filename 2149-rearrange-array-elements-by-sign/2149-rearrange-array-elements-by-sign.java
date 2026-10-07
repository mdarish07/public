class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n=nums.length;
        int res[]=new int[n];
        int j=0,x=0,y=1;
        while(j<n){
            if(nums[j]>0){
          res[x]=nums[j];
          x+=2;
            }
  else {
       res[y]=nums[j];
       y+=2;
        }
         j++;
        }
        return res;
    }
}