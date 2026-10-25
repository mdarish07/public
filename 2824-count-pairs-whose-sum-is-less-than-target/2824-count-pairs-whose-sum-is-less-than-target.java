class Solution {
    public int countPairs(List<Integer> nums, int target) {
        int n=nums.size();
      Collections.sort(nums);
        int i=0,j=n-1;
        int c=0;
        while(i<j){
            int sum=nums.get(i)+nums.get(j);
            if(sum<target){
             c+=j-i;
             i++;
            }
            else{
                 j--;
            }
            }
       return c;
    }
}