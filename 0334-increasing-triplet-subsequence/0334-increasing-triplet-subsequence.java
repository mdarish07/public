class Solution {
    public boolean increasingTriplet(int[] nums) {
        int FirstSmallest=Integer.MAX_VALUE;
        int SecondSmallest=Integer.MAX_VALUE;
        for(int num : nums){
            if(num<=FirstSmallest){
            FirstSmallest=num;
        }
            else if(num<=SecondSmallest ){
             SecondSmallest=num;
            }
             else{
             return true;
             }
        }
        return false;
    }
}