class Solution {
    public int missingNumber(int[] nums) {
        int n=nums.length;
        int ArraySum=0;
        int Actualsum=n*(n+1)/2;
       for(int i=0;i<n;i++){
         ArraySum+=nums[i];
       }
        return Actualsum-ArraySum;
    }
    
}