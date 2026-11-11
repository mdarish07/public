class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int n=nums.length,lp=0,gp=0,ep=0;
        int res[]=new int[n];
        for(int num : nums){
            if(num<pivot)
              lp++;
              else if(num==pivot)
             ep++;
              else
              gp++;
        }
         int x = 0, y = lp, z = lp + ep;
        for(int i=0;i<n;i++){
            if(nums[i]<pivot)
            res[x++]=nums[i];
        }
        for(int j=0;j<n;j++){
            if(nums[j]==pivot)
            res[y++]=nums[j];
        }
        for(int k=0;k<n;k++){
            if(nums[k]>pivot)
            res[z++]=nums[k];
        }
        return res;
    }
}