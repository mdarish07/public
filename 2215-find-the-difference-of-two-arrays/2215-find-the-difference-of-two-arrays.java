class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
          int n=nums1.length;
          int m=nums2.length;
         list.add(new ArrayList<>());
         list.add(new ArrayList<>());

          for(int i=0;i<n;i++){
if(!contains(nums2, nums1[i]) && !list.get(0).contains(nums1[i]))
           list.get(0).add(nums1[i]);
          }
          for(int i=0;i<m;i++){
if(!contains(nums1, nums2[i]) && !list.get(1).contains(nums2[i]))
           list.get(1).add(nums2[i]);
          }
          return new ArrayList<List<Integer>>(list);
    }
     public boolean contains(int[] arr, int target) {
        for (int num : arr) {
            if (num == target) {
                return true;
            }
        }
        return false;
    }
}