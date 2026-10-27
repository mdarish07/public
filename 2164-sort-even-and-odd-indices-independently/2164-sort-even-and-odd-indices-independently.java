class Solution {
    public int[] sortEvenOdd(int[] nums) {
        int n=nums.length;
        // Sort even indices in ascending order
        for (int i=0;i<n;i+=2){
            for (int j=i+2;j<n;j+=2){
                if (nums[i]>nums[j]){
                    swap(nums,i,j);
                }
            }
        }

        // Sort odd indices in descending order
        for (int i=1;i<n;i+=2){
            for (int j=i+2;j<n;j+=2){
                if (nums[i]<nums[j]){
                    swap(nums,i,j);
                }
            }
        }

        return nums;
    }

    public void swap(int[] nums,int i,int j) {
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
}
