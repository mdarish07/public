class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
    int max=0;
      for(int num: candies){
        max=Math.max(max,num);
      }
ArrayList<Boolean> res = new ArrayList<>();
      for(int i=0;i<candies.length;i++){
        res.add(candies[i]+extraCandies>=max);
      }
      return res;
    }
}