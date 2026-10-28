class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int temp[]=Arrays.copyOf(arr,arr.length);
        Arrays.sort(temp);
        int rank=1;
       HashMap<Integer,Integer> map=new HashMap<>();
       for(int num : temp){
        if(!map.containsKey(num))
            map.put(num,rank++);
       }
       int res[]=new int[arr.length];
       for(int i=0;i<arr.length;i++){
        res[i]=map.get(arr[i]);
               }
        return res;
    }
}