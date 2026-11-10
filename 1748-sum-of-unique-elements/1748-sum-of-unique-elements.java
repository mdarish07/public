class Solution {
    public int sumOfUnique(int[] nums) {
        int n=nums.length;
        int Freq[]=new int[101];
        for(int num : nums){
            Freq[num]++;
        }
 int sum=0;
 for(int i=1;i<=100;i++){
    if(Freq[i]==1)
    sum+=i;
 }
 return sum;
    }
}