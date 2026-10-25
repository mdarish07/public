class Solution {
    public int[] shuffle(int[] nums, int n) {
        int l=nums.length;
              int res[]=new int[l];
              for(int i=0;i<n;i++) {
                res[2*i]=nums[i];// even indices
                res[2*i+1]=nums[i+n];// odd indices
              }
              return res;
    }
}