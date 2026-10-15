class Solution {
    public int findGCD(int[] nums) {
        int n=nums.length;
        int largest=Integer.MIN_VALUE;
        int smallest=Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            if (nums[i] > largest) {
                largest = nums[i];
            }

            if (nums[i] < smallest) {
                smallest = nums[i];
            }
        }
        return gcd(largest,smallest);
    }
     public int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }

        return gcd(b, a % b);
    }
}