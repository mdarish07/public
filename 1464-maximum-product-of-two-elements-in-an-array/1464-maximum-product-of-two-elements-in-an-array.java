class Solution {
    public int maxProduct(int[] nums) {
        int n=nums.length;
        int FirstMax=Integer.MIN_VALUE;
        int SecondMax=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(nums[i]>FirstMax){
                SecondMax=FirstMax;
                FirstMax=nums[i];
            }
            else if(nums[i]>SecondMax){
            SecondMax=nums[i];
            }
        }
        return ((FirstMax-1)*(SecondMax-1));
    }
}