class Solution {
    public int minPairSum(int[] nums) {
        int i=0,n=nums.length;
        int j=n-1, res=0;
        Arrays.sort(nums);
        while(i<j){
            int sum=nums[i]+nums[j];
            res=(int)Math.max(res,sum);
            i++; j--;
        }
        return res;
    }
}