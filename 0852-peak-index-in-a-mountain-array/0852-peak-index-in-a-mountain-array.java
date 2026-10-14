
class Solution {
    public int peakIndexInMountainArray(int[] A) {
           int st = 1, end = A.length - 2;

        while (st <= end) {
            int mid = st + (end - st) / 2;

            if (A[mid - 1] < A[mid] &&
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