class Solution {
    public boolean containsDuplicate(int[] nums) {
        int i=1,j=0,n=nums.length-1; 
      Arrays.sort(nums);
        while(j<n){
            if(nums[i-1]==nums[i]){
                return true;
            }
            else{
                i++;j++;
            }
        }
        return false;
    }
}