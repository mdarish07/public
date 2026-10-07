class Solution {
    public int dominantIndex(int[] nums) {
        int n=nums.length;
        int max=nums[0], maxIdx=0;
      for(int i=1;i<n;i++){
        if(nums[i]>max){
            max=nums[i];
            maxIdx=i;
            }
      }
     for(int i=0;i<n;i++){
        if(i!=maxIdx && (nums[i]*2)>max)
        return -1;
     }
     return maxIdx;
    }
}