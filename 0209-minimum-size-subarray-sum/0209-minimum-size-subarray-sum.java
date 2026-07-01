class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int n=nums.length,i=0,j=0,sum=0,min=Integer.MAX_VALUE;
        while(j<n){
             sum+=nums[j];
            if(sum<target){
               j++;
            }
          
            else if(sum>=target){
                while(sum>=target){
                      min=Math.min(min,j-i+1);
                    sum-=nums[i];
                    i++;
                }
                j++;
            }

        }
        return min== Integer.MAX_VALUE?0:min;
    }
}