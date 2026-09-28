class Solution {
    public int maximumCount(int[] nums) {
        int n=nums.length,PosC=0,NegC=0;
        for(int i=0;i<n;i++){
            if(nums[i]>0)
            PosC++;
            else if(nums[i]<0)
            NegC++;
            else 
            continue;
        }
        return (int)Math.max(PosC,NegC);
    }
}