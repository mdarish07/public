class Solution {
    public int findDuplicate(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        int duplicateNumber=0;
        int j=0;
        for(int i=1;i<n;i++){
            if(nums[i-1]!=nums[i])
            j++;
            else
 duplicateNumber=nums[j];
        }
        return duplicateNumber;
    }
}