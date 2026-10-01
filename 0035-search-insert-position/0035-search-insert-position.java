class Solution {
    public int searchInsert(int[] nums, int target) {
        // BRUTE FORCE SOLN.
       /* int n=nums.length;
        int j=0;
        while(j<n){
        if(nums[j]==target)
           break;
           else if(nums[j]>target)
           break;
           else
           j++;
        }
        return j; */
    // OPTIMAL SOLN.(BINARY SEARCH)
    int n=nums.length;
    int l=0,r=n-1;
    while(l<=r){
        int mid=l+(r-l)/2;
        if(nums[mid]==target)
           return mid;
        else if(nums[mid]<target)
        l=mid+1;
        else
        r=mid-1;
    }
    return l;
    }
}