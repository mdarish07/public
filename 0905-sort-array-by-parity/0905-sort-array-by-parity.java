class Solution {
    public int[] sortArrayByParity(int[] nums) {
       /* int n=nums.length;
        int res[]=new int[n];
        int idx=0;
        for(int i=0;i<n;i++){
            if(nums[i]%2==0)
         res[idx++]=nums[i];
        }
        for(int i=0;i<n;i++){
            if(nums[i]%2!=0)
            res[idx++]=nums[i];
        }
        return res; 
        */
        int n=nums.length;
        int i=0,j=n-1;
        while(i<j){
            if(nums[i]%2==0){
            i++;}
            else if(nums[j]%2!=0){
            j--;}
            else{
             int temp=nums[i];
            nums[i]=nums[j];
            nums[j]=temp;
            i++; j--;
            }
        }
return nums;
    }
}