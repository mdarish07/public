class Solution {
    public int pivotIndex(int[] nums) {
        int n=nums.length;
        int ps[]=new int [n];
        int ss[]=new int[n];
        //left sum(prefix sum)
        ps[0]=nums[0];
        for(int i=1;i<n;i++){
            ps[i]=ps[i-1]+nums[i];
        }
        //right sum(suffix sum)
        ss[n-1]=nums[n-1];
        for(int i=n-2;i>=0;i--){
             ss[i]=ss[i+1]+nums[i];
        }
        //index finding
        for(int i=0;i<n;i++){
            if(ps[i]==ss[i]){
                return i;
            }
        }
        return -1;
    }
}