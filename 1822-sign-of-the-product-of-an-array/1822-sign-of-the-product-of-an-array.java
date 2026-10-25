class Solution {
    public int arraySign(int[] nums) {
        int n=nums.length;
        int PosC=0,NegC=0;
        for(int i=0;i<n;i++){
            if(nums[i]==0)
            return 0;
            else if(nums[i]>0)
            PosC++;
            else
             NegC++;
        }
        if(NegC%2==0)
        return 1;
        else
        return -1;
    }
}