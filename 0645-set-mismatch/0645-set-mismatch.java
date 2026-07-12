class Solution {
    public int[] findErrorNums(int[] nums) {
        HashMap<Integer,Integer>map=new HashMap<>();
        int res[]=new int[2];
        for(int num: nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        for(int num: nums){
            if(map.get(num)>1){
            res[0]=num;
            break;
            }
        }
        for(int i=1;i<=nums.length;i++){
            if(!map.containsKey(i)){
            res[1]=i;
            break;
            }
        }
        return res;
    }
}