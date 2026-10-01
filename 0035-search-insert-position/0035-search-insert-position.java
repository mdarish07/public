class Solution {
    public int searchInsert(int[] nums, int target) {
        int n=nums.length;
        int j=0;
        while(j<n){
        if(nums[j]==target)
           break;
           else if(nums[j]>target)
           break;
           else
           j++;
        }
        return j;
    }
}