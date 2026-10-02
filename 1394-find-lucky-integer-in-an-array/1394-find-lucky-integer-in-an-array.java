class Solution {
    public int findLucky(int[] arr) {
        int freq[]=new int[501];
        int FreqCount=1;
        for(int i=0;i<arr.length;i++){
           int freqIdx=arr[i];
          freq[freqIdx]++;
        }
    for(int i=freq.length-1;i>=1;i--){// for find largest lucky integer
        if(freq[i]==i){
            return i;
        }
    }
    return -1;
    }
}