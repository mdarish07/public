class Solution {
    public int countElements(int[] nums) {
        int min=Integer.MAX_VALUE,max=Integer.MIN_VALUE;
        for(int num : nums){
        if(num>max)
        max=num;
        if(num<min)
        min=num;
        }
        int c=0;
   for(int num : nums){
    if(num>min && num<max)
    c++;
   }
   return c;
    }
}