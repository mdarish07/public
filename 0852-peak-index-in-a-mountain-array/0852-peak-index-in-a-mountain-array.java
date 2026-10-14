
class Solution {
    public int peakIndexInMountainArray(int[] A) {
           int st = 0, end = A.length - 1;

        while (st <= end) {
            int mid = st + (end - st) / 2;

            if (mid > 0 && mid < A.length - 1 &&
                A[mid - 1] < A[mid] &&
                A[mid] > A[mid + 1]) {
                return mid;
            } 
            else if (mid < A.length - 1 &&
                     A[mid] < A[mid + 1]) {
                st = mid + 1; // right
            } 
            else {
                end = mid - 1; // left
            }
        }
        return -1;
    }
}