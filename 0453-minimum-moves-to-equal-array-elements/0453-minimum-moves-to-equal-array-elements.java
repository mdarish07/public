class Solution {
    public int minMoves(int[] nums) {
        int n=nums.length;
        int i=0,j=n-1;
        int c=0;
        Arrays.sort(nums);
        while(i<j){
           c+=nums[j]-nums[i];
           j--;
        }
        return c;
    }
}