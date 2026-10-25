class Solution {
    public int differenceOfSum(int[] nums) {
        int n=nums.length,sum=0;
        for(int i=0;i<n;i++){
            sum+=nums[i];
        }
      int DigitSum=0;
    for(int i=0;i<n;i++){
        int num=nums[i];
        while(num>0){
            int d=num%10;
             DigitSum+=d;
             num/=10;
        }
    }
    return (int)Math.abs(sum-DigitSum);
    }
}