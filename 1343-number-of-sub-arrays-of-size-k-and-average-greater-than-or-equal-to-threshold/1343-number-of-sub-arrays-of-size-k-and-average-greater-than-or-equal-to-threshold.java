class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int n=arr.length,i=0,j=0,c=0,sum=0;
        double avg=0;
        while(j<n){
            sum+=arr[j];
            if(j-i+1<k){
                j++;
            }
            else if(j-i+1==k){
                avg=(double)sum/k;
                if(avg>=threshold){
                    c++;
                }
                sum-=arr[i];
                i++;j++;
            }
        }
        return c;
    }
}